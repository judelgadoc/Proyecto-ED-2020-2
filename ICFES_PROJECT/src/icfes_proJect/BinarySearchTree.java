
package icfes_proJect;
import java.io.*;
import java.util.*;

class BinarySearchTree {

    class Node {
   	 public String[] data;
   	 public Node left = null;
   	 public Node right = null;
   	 public Node(String[] newData) {
       	     data = newData;
   	 }
    }

    public Node root;
    private int sortedByKey = -1;
    public void preFix() {
        System.out.print("Prefix: ");
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node p) {
        System.out.print(" " + p.data);
        if (!(p.left == null || p.right == null)) {
            preOrder(p.left);
            preOrder(p.right);
        }
    }
    public void inFix() {
        System.out.print("Infix: ");
        inOrder(root);
        System.out.println();
    }
    private void inOrder(Node p) {
        if (!(p.left == null || p.right == null)) {
            System.out.print('(');
            inOrder(p.left);
            System.out.print(" " + Arrays.toString(p.data));
            inOrder(p.right);
            System.out.print(')');
        } else
            System.out.print(" " + Arrays.toString(p.data));
    }
    public void insertBST(String[] newData, int key) {
        root = insert(newData, root, key);
    }
    private Node insert(String[] newData, Node p, int key) {
        if (p == null)
            p = new Node(newData);
        else {
            if (newData[key].compareTo(p.data[key]) < 0)
                p.left = insert(newData, p.left, key);
            else
                p.right = insert(newData, p.right, key);
        }
        return p;
    }
    private Node findMin(Node p) {
        if (p != null)
            while(p.left != null)
                p = p.left;
        return p;
    }
    public void removeBST(String data, int key) {
        root = remove(data, root, key);
    }
    private Node remove(String data, Node p, int key) {
        if (p != null) 
            if (data.compareTo(p.data[key]) < 0)
                p.left=remove(data, p.left, key);
            else
                if (data.compareTo(p.data[key]) > 0)
                    p.right=remove(data, p.right, key);
                else
                    if (p.left == null && p.right==null)
                        p = null;
                    else if (p.left == null)
                        p = p.right;
                    else if (p.right == null)
                        p = p.left;
                    else {
                        Node t = findMin(p.right);
                        p.data = t.data;
                        p.right = remove(p.data[key], p.right, key);
                    }
        else
            System.out.println("Item not in tree and not removed");
        return p;
    }
    public void sort(int key) {
        BinarySearchTree aux = new BinarySearchTree();
        while (root != null) {
            String[] data = root.data;
            aux.insertBST(data, key);
            removeBST(data[key], key);
        }
        root = aux.root;
        sortedByKey = key;
    }
    public BinarySearchTree searchBST(String data, int key) {
        /*if (sortedByKey != key)
            sort(key); */
        BinarySearchTree aux = new BinarySearchTree();
        Node p = search(data, root, key);
        while(p != null && p.data[key].equals(data)) {
            aux.insertBST(p.data, key);
            p = p.right;
        }
        return aux;
    }
    private Node search(String data, Node p, int key) {
        if (p == null)
            return null;
        boolean found = false;
        Node ptr = p;
        while (ptr != null && !found) {
            if (data.compareTo(ptr.data[key]) < 0)
                ptr = ptr.left;
            else if (data.compareTo(ptr.data[key]) > 0)
                ptr = ptr.right;
            else
                found = true;
        }
        return ptr;
    }
    public void traverseBST() {
        System.out.print("The tree is: { ");
        if (root != null)
            traverse(root);
        else
            System.out.print(" " + "Empty ");
        System.out.println("}");
    }
    private void traverse(Node ptr) {
        if (ptr.left != null)
            traverse(ptr.left);
        System.out.print(Arrays.toString(ptr.data) + "; ");
        if (ptr.right != null)
            traverse(ptr.right);
    }
}
