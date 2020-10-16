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
public class queue_using_arrays<T> {

    private int N;
    private int front, rear, count;
    private T[] qarray;

    public queue_using_arrays(int  N) {
        this.N=N;
        front = rear = count = 0;
        qarray = (T[]) new Object[N];
    }
    public void enqueue(T item) {
        if (full()) {
            System.out.println("Queue is full: item not enqueued");
           }         
        else {
            qarray[rear] = item;
            rear = (rear + 1) % N;
            count++;           
        }       
    }
    public T dequeue() {
        T item = null;
        if (empty()) {
            System.out.println("Queue is empty: "
                    + "item not dequeued");
        } else {
            item = qarray[front];
            front = (front + 1) % N;
            count--;
        }
        return item;
    }

    public boolean empty() {
        return count <= 0;
    }

    public boolean full() {
        return count >= N ;
    }
}

