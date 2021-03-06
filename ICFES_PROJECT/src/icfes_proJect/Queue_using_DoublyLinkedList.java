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
public class Queue_using_DoublyLinkedList<T> {
    private DoublyLinkedList queue;
    private Node<T> front, rear;
    private int size;
    
    public Queue_using_DoublyLinkedList(){
        queue = new DoublyLinkedList();
        front = rear = null;
        size = 0;
        
    }
    public void enqueue(T data){
        this.queue.pushBack(data);
        this.front = queue.getHead();
        this.size++;
    }
    
    public T dequeue()throws RuntimeException{
        T t; 
        if (size>0){
            t = (T)this.queue.popFront();
            this.front = queue.getHead();
            this.size--;            
        }else{
            throw new RuntimeException("queue is empty");
        }

        return t;
    }
    
    public T peek(){
        T t;
        if (size>0){
            t = (T)this.front.data;
        }else{
            t = null;
        } 
        return t;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public int size(){
        return (int)this.size;
    }
}
