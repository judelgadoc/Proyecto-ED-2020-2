/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icfes_proJect;

import java.util.Arrays;

/**
 *
 * @author jalco
 */
public class MinHeap {
    private int n = 20;
    public String[][] array;
    private int size;

    public MinHeap(int n) {
        this.n = n;
        array = new String[n][25];
        size = 0;
    }
    public void insertItem(String[] item, int key) {
        array[size] = item;
        moveUp(key);
        size++;
    }
    
    public String[][] getArrayHeap(){
        return this.array;
    }
    private void moveUp(int key) {
        int child = size;
        int parent = (child - 1)/2;
        String[] temp = array[child];
        while (child > 0 && temp[key].compareTo(array[parent][key]) < 0) {
            array[child] = array[parent];
            child = parent;
            parent = (child - 1)/2;
        }
        array[child] = temp;
    }
    public String[] removeMin(int key) {
        String[] min = array[0];
        array[0] = array[--size];
        moveDown(key);
        return min;
    }
    private void moveDown(int key) {
        boolean flag = false;
        String[] smallest = {""};  // Si hay cadenas vacías  en la base no funcionará
        int parent = 0;
        int child = 2*parent+1;
        String[] temp = array[parent];
        while (child < size && !flag) {
            smallest = array[child];
            if (child + 1 < size && array[child + 1][key].compareTo(array[child][key]) < 0)
                smallest = array[++child];
            if (smallest[key].compareTo(temp[key]) < 0) {
                array[parent] = smallest;
                parent = child;
            }else 
                flag = true;
            child = 2*parent + 1;
        }
        array[parent] = temp;
    }
    public String toString() {
        String ans = "Arreglo del heap: {";
        for (int i = 0; i < size; i++) {
            ans = ans + Arrays.toString(array[i]);
            if (i < size-1)
                ans = ans + "; ";
        }
        return ans + "}";
    }
    public String priorityQueueToString(int key) {
        String ans = "Priority queue: {";
        int n = size;
        for (int i = 0; i < n; i++) {
            ans = ans + Arrays.toString(removeMin(key));
            if (i < n-1)
                ans = ans + "; ";
        }
        return ans + "}";
    }
}
