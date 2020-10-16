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
public class Node<T> {
    public T data;
    public Node next;
    public Node prev;

    public Node(T newData) {
        data = newData;
        next = null;
        prev = null;
    }
}