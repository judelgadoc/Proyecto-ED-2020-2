/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icfes_proJect;

/**
 *
 * @author maleja
 */
public class Stack_using_arrays<T> {
    
    private int top ,N;
    private T[] sarray;


    public Stack_using_arrays(int n) {
        this.N=n;
        top = 0;
        sarray = (T[]) new Object[n];
    }
// value returning methods

    public boolean empty() {
        return top <= 0;
    }

    private boolean full() {
        return top >= sarray.length;
    }

    public T pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        top--;
        return sarray[top];
    }
// void method

    public void push(T item) {
        if (full()) {
            throw new RuntimeException("Stack is full");
        }
        sarray[top] = item;
        top++;
    }
}

