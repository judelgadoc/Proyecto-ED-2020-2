/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icfes_proJect;

/**
 *
 * @author javie
 */
public class Stack_using_SinglyLinkedList <T> {
    private SinglyLinkedList stack; 
    private Node<T> top;
    private int size;
    
    Stack_using_SinglyLinkedList(){
        this.top = null;
        this.size = 0;
        stack= new SinglyLinkedList();
    }
    
    public void push(T date){
        this.stack.pushFront(date); 
        top = this.stack.getHead();
        this.size++;
    }
    public T pop() throws RuntimeException{
        T ans = (T)this.stack.popFront();
        this.top = stack.getHead();
        if (size>0){
            this.size--;            
        }else{
            throw new RuntimeException("List is empty");
        }

        return ans;
    }
    
    public int size(){
        return (int)this.size;
    }
    
    public T peek(){
        T t;
        if (this.top != null){
            t = (T)top.data;
        }else{
            t = null;
        }
        return t;
    }
    
    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }else{
            return false;
        }
    }
}
