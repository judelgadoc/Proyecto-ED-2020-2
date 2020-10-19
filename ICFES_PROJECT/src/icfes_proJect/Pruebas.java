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
public class Pruebas {
    
    public SinglyLinkedList SinglyPushBack(int numOfLines) { // full
        SinglyLinkedList<String[]> list = new SinglyLinkedList<String[]>();
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        for (int i = 0; i < numOfLines; i++)
            list.pushBack(reader.returnString());
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "pushBack (full)", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de pushBack (full), en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
        return list;
    }
    public void SinglyPopBack(int numOfLines, SinglyLinkedList list) { // Solo cuenta pero no modifica (vuelve a push después de contar)
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        String[] popped = (String[]) list.popBack();
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "popBack (uno)", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de popBack(uno) en nanosegundos para es: " + (stopTime - startTime));
        System.out.println(text);
        list.pushBack(popped);
    }
    
    public SinglyLinkedList SinglyPushFront(int numOfLines) { //full
        SinglyLinkedList<String[]> list = new SinglyLinkedList<String[]>();
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        for (int i = 0; i < numOfLines; i++)
            list.pushFront(reader.returnString());
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "pushFront(full)", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de pushFront(full) en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
        return list;
    }
    public void SinglyPopFront(int numOfLines, SinglyLinkedList list) { // Solo cuenta pero no modifica (vuelve a push después de contar)
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        String[] popped = (String[]) list.popFront();
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "popFront (uno)", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de popFront (uno), en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
        list.pushFront(popped);
    }
    public void SinglyAddAfter(int index, String dato, SinglyLinkedList list, String[] dataIn) {//recibe dos nodos o datos, uno es referencia y el otro se adiciona antes del primero
        // index indice don del arreglo donde se budca el dato,  data in, nuevo arreglo a ingresar
        long startTime, stopTime;
        String text;
        Node nodo = list.findNodo(index,dato);
        startTime = System.nanoTime();
        list.addAfter(nodo, dataIn);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "addAfter",  (stopTime - startTime)/1e9);
        System.out.println("Tiempo de addAfter en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
    }
    public void SinglyAddBefore(int index, String dato, SinglyLinkedList list, String[] dataIn) {//recibe dos nodos o datos, uno es referencia el otro se adiciona despues de la referencia
        long startTime, stopTime;
        String text;
        Node nodo = list.findNodo(index,dato);
        startTime = System.nanoTime();
        list.addBefore(nodo, dataIn);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "addBefore", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de addBefore en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
    }
    public void SinglyInsertMitad(int numOfLines, SinglyLinkedList list, String[] data) {
        long startTime, stopTime;
        String text;
        Node middle = list.findNodoIn(numOfLines/2);
        startTime = System.nanoTime();
        list.addAfter(middle, data);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "addAfter (mitad)", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo de addAfter(mitad) en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
    }
    public void SinglyFind(int index, String data, SinglyLinkedList list) {//debe recibir el dato a buscar
        long startTime, stopTime;
        String text; 
        //String data = "SB11201820548618";
        startTime = System.nanoTime();
        list.find(index, data);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "find (mitad)", (stopTime - startTime)/1e9);
        System.out.println("Tiempo find(mitad) en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
    }
    public void SinglyDelete(int numOfLines, SinglyLinkedList list) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        list.delete(numOfLines/2);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "delete (mitad)", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de delete(mitad) en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
    }
    public void SinglySort(int numOfLines,SinglyLinkedList list) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        list.sort(4);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "sort", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de sort en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
    }
    public DoublyLinkedList DoublyPushBack(int numOfLines) { // full
        DoublyLinkedList<String[]> list = new DoublyLinkedList<String[]>();
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        for (int i = 0; i < numOfLines; i++)
            list.pushBack(reader.returnString());
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "pushBack (full)", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de pushBack (full), en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
        return list;
    }
    public void DoublyPopBack(int numOfLines, DoublyLinkedList list) { // Solo cuenta pero no modifica (vuelve a push después de contar)
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        String[] popped = (String[]) list.popBack();
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "popBack (uno)", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de popBack(uno) en nanosegundos para es: " + (stopTime - startTime));
        System.out.println(text);
        list.pushBack(popped);
    }
    
    public DoublyLinkedList DoublyPushFront(int numOfLines) { //full
        DoublyLinkedList<String[]> list = new DoublyLinkedList<String[]>();
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        for (int i = 0; i < numOfLines; i++)
            list.pushFront(reader.returnString());
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "pushFront(full)", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de pushFront(full) en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
        return list;
    }
    public void DoublyPopFront(int numOfLines, DoublyLinkedList list) { // Solo cuenta pero no modifica (vuelve a push después de contar)
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        String[] popped = (String[]) list.popFront();
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "popFront (uno)", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de popFront (uno), en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
        list.pushFront(popped);
    }
    public void DoublyAddAfter(int index, String dato, DoublyLinkedList list, String[] dataIn) {//recibe dos nodos o datos, uno es referencia y el otro se adiciona antes del primero
        // index indice don del arreglo donde se budca el dato,  data in, nuevo arreglo a ingresar
        long startTime, stopTime;
        String text;
        Node nodo = list.findNodo(index,dato);
        startTime = System.nanoTime();
        list.addAfter(nodo, dataIn);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "addAfter",  (stopTime - startTime)/1e9);
        System.out.println("Tiempo de addAfter en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
    }
    public void DoublyAddBefore(int index, String dato, DoublyLinkedList list, String[] dataIn) {//recibe dos nodos o datos, uno es referencia el otro se adiciona despues de la referencia
        long startTime, stopTime;
        String text;
        Node nodo = list.findNodo(index,dato);
        startTime = System.nanoTime();
        list.addBefore(nodo, dataIn);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "addBefore", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de addBefore en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
    }
    public void DoublyInsertMitad(int numOfLines, DoublyLinkedList list, String[] data) {
        long startTime, stopTime;
        String text;
        Node middle = list.findNodoIn(numOfLines/2);
        startTime = System.nanoTime();
        list.addAfter(middle, data);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "addAfter (mitad)", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo de addAfter(mitad) en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
    }
    public void DoublyFind(int index, String data, DoublyLinkedList list) {//debe recibir el dato a buscar
        long startTime, stopTime;
        String text; 
        //String data = "SB11201820548618";
        startTime = System.nanoTime();
        list.find(index, data);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "find (mitad)", (stopTime - startTime)/1e9);
        System.out.println("Tiempo find(mitad) en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
    }
    public void DoublyDelete(int numOfLines, DoublyLinkedList list) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        list.delete(numOfLines/2);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "delete (mitad)", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de delete(mitad) en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
    }
    public void DoublySort(int numOfLines,DoublyLinkedList list) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        list.sort(4);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "sort", (stopTime - startTime)/1e9);
        System.out.println("Tiempo de sort en nanosegundos es: " + (stopTime - startTime));
        System.out.println(text);
    }
}
