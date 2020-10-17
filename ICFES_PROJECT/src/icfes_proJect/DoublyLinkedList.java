/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icfes_proJect;

/**
 *
 * @author judelgadoc
 */
public class DoublyLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public DoublyLinkedList(T newData) {
        head = new Node<T>(newData);
        tail = head.next;
        tail.prev = head;
    }
    public void pushFront(T newData) {
        Node<T> newNode = new Node<T>(newData);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        if (tail == null)
            tail = head;
    }
    public T popFront ()throws RuntimeException {
        if (head == null)
            throw new RuntimeException("List is empty");
        T ans = head.data;
        head = head.next;
        if (head == null){
            tail = null;
        }else if (head.next != null){
            head.next.prev = head;    
        }
        return ans;
    }
    public void pushBack(T newData) {
        Node<T> newNode = new Node<T>(newData);
        if (tail == null) {
            head = tail = newNode;
            newNode.prev = null;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public T popBack()throws RuntimeException {
        T ans = null;
        if (head == null)
            throw new RuntimeException("List is empty");
        ans = tail.data;
        if (head == tail)
            head = tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
        return ans;
    }
    public void addAfter(Node node, T newData) {
        if (node == null)
            pushBack(newData);
        else {
            Node<T> newNode = new Node<T>(newData);
            newNode.next = node.next;
            newNode.prev = node;
            node.next = newNode;
            if (newNode.next != null)
                newNode.next.prev = newNode;
            if (tail == node)
                tail = newNode;
        }
    }
    public void addBefore(Node node, T newData){
        if (node == null || node == head)
            pushFront(newData);
        else {
            Node<T> newNode = new Node<T>(newData);
            newNode.next = node;
            newNode.prev = node.prev;
            node.prev = newNode;
            if (newNode.prev != null)
                newNode.prev.next = newNode;
            if (head == node)
                head = newNode;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }
    public boolean find(T key) {
        Node<T> ref = head;
        boolean foundFlag = false;
        while (ref.next != null && !foundFlag) {
            foundFlag = ref.data == key;
            ref = ref.next;
        }
        return foundFlag;
    }
    public void delete(T key) {
        Node<T> ref = head;
        while (ref.next.data != key)
            ref = ref.next;
        ref.next = ref.next.next;
    }
    public void print(){
        System.out.print("List recursive: ");
        printR(head);
        System.out.println();
    }
    public void printR(Node p) {
        if (p != null) {
            System.out.print(p.data + " ");
            printR(p.next);
        }
    }
    //agregar ///////////////////////////////////////////
    public Node getHead(){
        return this.head;
    }
    public Node getTail(){
        return this.tail;
    }
}
