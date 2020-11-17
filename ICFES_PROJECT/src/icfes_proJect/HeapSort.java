/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icfes_proJect;

/**
 *
 * @author jalco
 */
public class HeapSort {
       public HeapSort() {
    }
    private void swapElements(String[][] a, int i, int j) {
        String[] temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    private void moveDown(String[][] array, int parent, int size, int key) {
        boolean flag = false;
        String[] largest = {""};  // Si hay cadenas vacías  en la base no funcionará
        //int parent = 0;
        int child = 2*parent+1;
        String[] temp = array[parent];
        while (child < size && !flag) {
            largest = array[child];
            if (child + 1 < size && array[child + 1][key].compareTo(array[child][key]) > 0)
                largest = array[++child];
            if (largest[key].compareTo(temp[key]) > 0) {
                array[parent] = largest;
                parent = child;
            }else 
                flag = true;
            child = 2*parent + 1;
        }
        array[parent] = temp;
    }
    public void makeHeap(String[][] array, int n, int key){
        for (int i = n/2 - 1; i >= 0; i--)
            moveDown(array, i, n, key);
    }
    public void heapSort(String[][] array, int n, int key) {
        makeHeap(array, n, key);
        for(int i = n-1; i > 0; i--) {
            swapElements(array, 0, i);
            moveDown(array, 0, i, key);
        }
    } 
}
