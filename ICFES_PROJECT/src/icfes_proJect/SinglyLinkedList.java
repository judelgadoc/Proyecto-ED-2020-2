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
public class SinglyLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    public SinglyLinkedList(T newData) {
        head = new Node<T>(newData);
        tail = head.next;
    }
    public void pushFront(T newData) {
        Node<T> newNode = new Node<T>(newData);
        newNode.next = head;
        head = newNode;
        if (tail == null)
            tail = head;
    }
    public T popFront () {
        if (head == null)
            throw new RuntimeException("List is empty");
        T ans = head.data;
        head = head.next;
        if (head == null)
            tail = null;
        return ans;
    }
    public void pushBack(T newData) {
        Node<T> newNode = new Node<T>(newData);
        if (tail == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public T popBack() {
        T ans = null;
        if (head == null)
            throw new RuntimeException("List is empty");
        ans = tail.data;
        if (head == tail) 
            head = tail = null;
        else {
            Node<T> ref = head;
            while (ref.next.next != null) 
                ref = ref.next;
            tail = ref;
            tail.next = null;
        }
        return ans;
    }
    public void addAfter(Node node, T newData) {
        Node<T> newNode = new Node<T>(newData);
        newNode.next = node.next;
        node.next = newNode;
        if (tail == node)
            tail = newNode;
    }
    public void addBefore(Node node, T newData){
        Node<T> newNode = new Node<T>(newData);
        Node<T> ref = head;
        while (ref.next != node)
            ref = ref.next;
        newNode.next = ref.next;
        ref.next = newNode;
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
}
