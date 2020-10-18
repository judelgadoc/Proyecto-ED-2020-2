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
    public int size=0;

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
            size++;
    }
    public T popFront () {
        if (head == null)
            throw new RuntimeException("List is empty");
        T ans = head.data;
        head = head.next;
        if (head == null)
            tail = null;
        else if (head.next != null)
            head.next.prev = head;
        size--;
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
        size++;
    }
    public T popBack() {
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
        size--;
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
                size++;
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
            size++;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int find(int idx, String key) {
        Node ref = head;
        boolean foundFlag = false;
        String[] temp;
        int count = 0;
        while (ref.next != null && !foundFlag) {
            temp = (String[]) ref.data;
            foundFlag = temp[idx].equals(key);
            ref = ref.next;
            count++;
        }
        return count;
    }
    public void delete(int position) {
        if (position == 0)
            popFront();
        else {
            int n = 0;
            Node ref = head;
            while (n < position -1) {
                ref = ref.next;
                n++;
            }
            ref.next = ref.next.next;
            size--;
        }
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
    public void sort(int idx) {
        // using BubbleSort
        if(head.next != null&&head != null){
            Node node1 = head;
            Node node2 = head.next;
            
            for(int i = 0;i<size;i++) {  
                while(node2!= null) {
                    String[] temp1 = (String[]) node1.data;
                    String[] temp2 = (String[]) node2.data;
                    if (temp1[idx].compareTo(temp2[idx]) > 0) {
                        if (node1 == head){
                            head = node2;
                        }
                        String[] aux= (String[])node2.data;
                        node2.data = node1.data;
                        node1.data = aux;
                    }   
                    node1 = node1.next;
                    node2 = node2.next;
                  
                }
                node1 = head;
                node2 = head.next;
          }
        }
        /*Node aux = head;
        while(aux != null){
          System.out.println(((String[])aux.data)[4]);
          aux = aux.next;
        }*/
    }
    //agregar ///////////////////////////////////////////
    public Node getHead(){
        return this.head;
    }
    public Node getTail(){
        return this.tail;
    }
}
