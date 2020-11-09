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

/**
 * queue_using_arrays<Integer> queue =new queue_using_arrays<>(10);
        for (int i=0;i<10;i++){
                       
            queue.enqueue(i);
        }
        
        for (int i=0;i<10;i++){
            System.out.println(queue.dequeue());           
        }
               
        System.out.println("hello");
         Stack_using_arrays<Integer> stack =new  Stack_using_arrays<>(10);
        for (int i=0;i<10;i++){
         
            stack.push(i);
        }       
        for (int i=0;i<10;i++){
            System.out.println(stack.pop());
            
        }
 */