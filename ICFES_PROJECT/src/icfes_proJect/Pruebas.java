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
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "pushBack", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en crear lista push back nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
        return list;
    }
    public void SinglyPopBack(int numOfLines, SinglyLinkedList list) { // Solo cuenta pero no modifica (vuelve a pushdespués de contar)
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        String[] popped = (String[]) list.popBack();
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "popBack (uno)", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
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
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "pushFront", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en crear lista push front en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
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
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "popFront (uno)", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
        list.pushFront(popped);
    }
    public void SinglyAddAfter(int numOfLines) {//recibe dos nodos o datos, uno es referencia y el otro se adiciona antes del primero
        SinglyLinkedList<String[]> list = new SinglyLinkedList<String[]>();
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        for (int i = 0; i < numOfLines; i++)
            list.addAfter(list.head, reader.returnString());
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "addAfter", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
    }
    public void SinglyAddBefore(int numOfLines) {//recibe dos nodos o datos, uno es referencia el otro se adiciona despues de la referencia
        SinglyLinkedList<String[]> list = new SinglyLinkedList<String[]>();
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        for (int i = 0; i < numOfLines; i++)
            list.addBefore(list.head, reader.returnString());
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "addBefore", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
    }
    public void SinglyInsertMitad(int numOfLines) {
        SinglyLinkedList<String[]> list = new SinglyLinkedList<String[]>();
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text;
        Node middle = list.tail;
        String[] data;
        for (int i = 0; i < numOfLines-1; i++) {
            data = reader.returnString();
            list.pushFront(data);
            if (i == numOfLines/2)
                middle = list.tail;
        }
        startTime = System.nanoTime();
        list.addBefore(middle, reader.returnString());
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "addBefore (mitad)", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
    }
    public void SinglyFind(int numOfLines, String data) {//debe recibir el dato a buscar
        SinglyLinkedList<String[]> list = new SinglyLinkedList<String[]>();
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text; 
        //String data = "SB11201820548618";
        int idx = new Titles().getIndexOf("ESTU_CONSECUTIVO");
        String[] temp;
        for (int i = 0; i < numOfLines; i++) {
            temp = reader.returnString();
            if (i == numOfLines/2)
                data = temp[idx];
            list.pushFront(temp);
        }
        startTime = System.nanoTime();
        list.find(idx, data);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "find (mitad)", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
    }
    public void SinglyDelete(int numOfLines, SinglyLinkedList list) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        list.delete(numOfLines/2);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "delete (mitad)", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
    }
    public void SinglySort(int numOfLines,SinglyLinkedList list) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        list.sort(4);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "sort", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
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
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "pushBack", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en crear lista push back nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
        return list;
    }
    public void DoublyPopBack(int numOfLines, DoublyLinkedList list) { // Solo cuenta pero no modifica (vuelve a pushdespués de contar)
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        String[] popped = (String[]) list.popBack();
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "popBack (uno)", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
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
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "pushFront", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en crear lista push front en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
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
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "popFront (uno)", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
        list.pushFront(popped);
    }
    public void DoublyAddAfter(int numOfLines) {//recibe dos nodos o datos, uno es referencia y el otro se adiciona antes del primero
        DoublyLinkedList<String[]> list = new DoublyLinkedList<String[]>();
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        for (int i = 0; i < numOfLines; i++)
            list.addAfter(list.head, reader.returnString());
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "addAfter", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
    }
    public void DoublyAddBefore(int numOfLines) {//recibe dos nodos o datos, uno es referencia el otro se adiciona despues de la referencia
        DoublyLinkedList<String[]> list = new DoublyLinkedList<String[]>();
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        for (int i = 0; i < numOfLines; i++)
            list.addBefore(list.head, reader.returnString());
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "addBefore", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
    }
    public void DoublyInsertMitad(int numOfLines) {
        DoublyLinkedList<String[]> list = new DoublyLinkedList<String[]>();
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text;
        Node middle = list.tail;
        String[] data;
        for (int i = 0; i < numOfLines-1; i++) {
            data = reader.returnString();
            list.pushFront(data);
            if (i == numOfLines/2)
                middle = list.tail;
        }
        startTime = System.nanoTime();
        list.addBefore(middle, reader.returnString());
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "addBefore (mitad)", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
    }
    public void DoublyFind(int numOfLines, String data) {//debe recibir el dato a buscar
        DoublyLinkedList<String[]> list = new DoublyLinkedList<String[]>();
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text; 
        //String data = "SB11201820548618";
        int idx = new Titles().getIndexOf("ESTU_CONSECUTIVO");
        String[] temp;
        for (int i = 0; i < numOfLines; i++) {
            temp = reader.returnString();
            if (i == numOfLines/2)
                data = temp[idx];
            list.pushFront(temp);
        }
        startTime = System.nanoTime();
        list.find(idx, data);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "find (mitad)", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
        reader.close();
    }
    public void DoublyDelete(int numOfLines, DoublyLinkedList list) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        list.delete(numOfLines/2);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "delete (mitad)", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
    }
    public void DoublySort(int numOfLines,DoublyLinkedList list) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        list.sort(4);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s para %s datos, en segundos: %s", "sort", numOfLines, (stopTime - startTime)/1e9);
        System.out.println("Tiempo en nanosegundos para " + numOfLines + " es: " + (stopTime - startTime));
        System.out.println(text);
    }
}
