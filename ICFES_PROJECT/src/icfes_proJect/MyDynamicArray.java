
package icfes_proJect;

import java.util.*;

public class MyDynamicArray {
    private int capacity;
    private String[][] arr;
    public int size = 0;
    private int sortedByKey = -1;
   
    public MyDynamicArray() {
	this(256);
    }
    public MyDynamicArray(int N) {
	capacity = N;
	arr  = new String[capacity][];
    }
    public String[] get (int i) {
        if (i < 0 || i >= size)
        throw new RuntimeException("My arr got index out of range");
        return arr[i];
    }
    public void set (int i, String[] val) {
        if (i < 0 || i >= size)
        throw new RuntimeException("My arr got index out of range");
        arr[i] = val;
    }
    public void pushBack(String[] val) {
        if (size == capacity) {
        String[][] newArr = new String[2*size][];
        for (int i = 0; i < size; i++)
            newArr[i] = arr[i];
        arr = null; arr = newArr;
        capacity = arr.length;
        }
        arr[size] = val;
        size++;
    }
    public String[] remove (int i) {
        if (i < 0 || i >= size)
        throw new RuntimeException("My arr got index out of range");
        String[] toReturn = arr[i];
        for (int j = i; j < size-1; j++)
            arr[j] = arr[j+1];
        size--;
        return toReturn;
    } // merge and mergeSort adapted from https://www.educative.io/edpresso/how-to-implement-a-merge-sort-in-java
    private void merge(String[][] leftArr, String[][] rightArr, String[][] arr, int leftSize, int rightSize, int key) {
        int i=0,l=0,r = 0;
        while(l<leftSize && r<rightSize){
            if(leftArr[l][key].compareTo(rightArr[r][key]) < 0)
                arr[i++] = leftArr[l++];
            else
                arr[i++] = rightArr[r++];
        }
        while(l<leftSize)
            arr[i++] = leftArr[l++];
        while(r<rightSize)
            arr[i++] = rightArr[r++];
    }
    private void mergeSort(String[][] arr, int len, int key) {
        if (len < 2) return;
        int mid = len / 2;
        String[][] leftArr = new String[mid][];
        String[][] rightArr = new String[len-mid][];
        int k = 0;
        for (int i = 0; i < len; ++i) {
            if (i < mid)
                leftArr[i] = arr[i];
            else {
                rightArr[k] = arr[i];
                k++;
            }
        }
        mergeSort(leftArr, mid, key);
        mergeSort(rightArr, len-mid, key);
        merge(leftArr, rightArr, arr, mid, len-mid, key);
    }
    public void sort(int key) {
        mergeSort(arr, size, key);
        sortedByKey = key;
    } // binarySearchIndex adapted from https://www.geeksforgeeks.org/binary-search/
    private int binarySearchIndex(String[][] arr, int l, int r, String x, int key) {
        if (sortedByKey != key)
            sort(key);
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
            if (arr[mid][key].equals(x)) 
                return mid; 
            if (arr[mid][key].compareTo(x) > 0) 
                return binarySearchIndex(arr, l, mid - 1, x, key); 
            return binarySearchIndex(arr, mid + 1, r, x, key); 
        } 
        return -1;
    }
    public MyDynamicArray search(String x, int key) {
        int idx = binarySearchIndex(arr, 0, size-1, x, key);
        MyDynamicArray aux = new MyDynamicArray();
        int i = idx;
        while (idx != -1 && i >= 0 && get(i)[key].equals(x)) {
            aux.pushBack(get(i));
            i--;
        }
        i = idx+1;
        while (idx != -1 && i < aux.size && get(i)[key].equals(x)) {
            aux.pushBack(get(i));
            i++;
        }
        return aux;
    }
    public String toString() {
        String ans = "{";
        for (int i = 0; i < capacity; i++) {
            ans = ans + Arrays.toString(arr[i]);
            if (i < capacity-1)
                ans = ans + "; ";
        }
        return ans + "}";
    }
}
