/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icfes_proJect;
import java.io.*;
import java.math.*;
import java.text.*;
import java.time.Instant;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author jalco
 */
public class ICFES_PROJECT {
    static Stack_using_DoublyLinkedList createStackDoublylinkedList(int n){
        paraleer bd = new paraleer();
        long start = System.nanoTime();
        Stack_using_DoublyLinkedList<String[]> stack = new Stack_using_DoublyLinkedList();
        for(int i = 0; i<n; i++){
            stack.push(bd.returnString());
        }
        long finish = System.nanoTime();
        bd.close();
        System.out.println("Creacion pila en lista doblemente enlazada " +  (finish - start) );
        return stack;
    }
    
    static void deleteStackDoublyLinkedList(int n,Stack_using_DoublyLinkedList<String[]> stack ){
        long start = System.nanoTime();
            for(int i = 1; i<n; i++){
                stack.pop();
            }
        long finish = System.nanoTime();
        System.out.println("Pila DoblementeEnlazada Eliminados en: " +  (finish - start) );
    }
    
    static void printStackDoublyLinkedList(int n, Stack_using_DoublyLinkedList<String[]> stack){
        long start = System.nanoTime();
        for(int i = 1; i<n; i++){
            System.out.println(Arrays.toString(stack.pop()));
        }
        long finish = System.nanoTime();
        System.out.println("pila doblemente enlazada Impresos en(nanosegundos): " +  (finish - start) );
    }
    
    static String[] findStackDoublyLinkedList(int index,String data, Stack_using_DoublyLinkedList<String[]> stack){
        long start = System.nanoTime();
        int size = stack.size();
        String[] aux = null;
        for(int i = 0; i<size; i++){
            if (stack.peek()[index].equals(data)){
                aux = stack.pop();
                System.out.println(Arrays.toString(aux));
            }else{
               stack.pop();
            }    
        }
        long finish = System.nanoTime();
        System.out.println("Busqueda pila Doblemente enlazada. Encontrado en:(nanosegundos) " +  (finish - start) );
        return aux;
    }
    
    static Queue_using_DoublyLinkedList createQueueDoublyLinkedList(int n){
        paraleer bd = new paraleer();
        long start = System.nanoTime();
        Queue_using_DoublyLinkedList<String[]> queue = new Queue_using_DoublyLinkedList();
        for(int i = 0; i<n; i++){
            queue.enqueue(bd.returnString());
        }
        long finish = System.nanoTime();
        bd.close();
        System.out.println("Creacion cola en lista doblemente enlazada (nanosegundos)" +  (finish - start) );
        return queue;
    }
    
    static void deleteQueueDoublylinkedList(int n,Queue_using_DoublyLinkedList<String[]> queue ){
        long start = System.nanoTime();
            for(int i = 1; i<n; i++){
                queue.dequeue();
            }
        long finish = System.nanoTime();
        System.out.println("Cola doblemente Enlazada Eliminados en(nanosegundos): " +  (finish - start) );
    }
    
    static void printQueueDoublyLinkedList(int n, Queue_using_DoublyLinkedList<String[]> queue){
        long start = System.nanoTime();
        for(int i = 1; i<n; i++){
            System.out.println(Arrays.toString(queue.dequeue()));
        }
        long finish = System.nanoTime();
        System.out.println("cola doblemente enlazada Impresos en (nanosegundos): " +  (finish - start) );
    }
    
    static String[] findQueueDoublyLinkedList(int index,String data, Queue_using_DoublyLinkedList<String[]> queue){
        long start = Instant.now().toEpochMilli();
        int size = queue.size();
        String[] aux = null;
        for(int i = 0; i<size; i++){
            if (queue.peek()[index].equals(data)){
                aux = queue.dequeue();
                System.out.println(Arrays.toString(aux));
            }else{
               queue.dequeue();
            }    
        }
        long finish = Instant.now().toEpochMilli();
        System.out.println("Busqueda cola doblemente enlazada. Encontrado en(milisegundos): " +  (finish - start) );
        return aux;
    }
    
    static Stack_using_SinglyLinkedList createStackSinglylinkedList(int n){
        paraleer b = new paraleer();
        long start = System.nanoTime();
        Stack_using_SinglyLinkedList<String[]> stack = new Stack_using_SinglyLinkedList();
        for(int i = 0; i<n; i++){
            stack.push(b.returnString());
        }
        long finish = System.nanoTime();
        b.close();
        System.out.println("Creación de pila simplemente enlazada " +  (finish - start) );
        return stack;
    }
    
    static void deleteStackSinglyLinkedList(int n,Stack_using_SinglyLinkedList<String[]> stack ){
        long start = System.nanoTime();
            for(int i = 1; i<n; i++){
                stack.pop();
            }
        long finish = System.nanoTime();
        System.out.println("Desapilados de pila simplemente enlazada en: " +  (finish - start) );
    }
    
    static void printStackSinglyLinkedList(int n, Stack_using_SinglyLinkedList<String[]> stack){
        long start = System.nanoTime();
        for(int i = 1; i<n; i++){
            System.out.println(Arrays.toString(stack.pop()));
        }
        long finish = System.nanoTime();
        System.out.println("t de impresión de pila simplemente enlazada: " +  (finish - start) );
    }
    
    static String[] findStackSinglyLinkedList(int index,String data, Stack_using_SinglyLinkedList<String[]> stack){
        long start = System.nanoTime();
        int size = stack.size();
        String[] aux = null;
        for(int i = 0; i<size; i++){
            if (stack.peek()[index].equals(data)){
                aux = stack.pop();
                System.out.println(Arrays.toString(aux));
            }else{
               stack.pop();
            }    
        }
        long finish = System.nanoTime();
        System.out.println("Encontrado en pila simplemente enlazada en : " +  (finish - start) );
        return aux;
    }
    ///////////////////
    static Queue_using_SinglyLinkedList createQueueSinglyLinkedList(int n){
        paraleer b = new paraleer();
        long start = System.nanoTime();
        Queue_using_SinglyLinkedList<String[]> queue = new Queue_using_SinglyLinkedList();
        for(int i = 0; i<n; i++){
            queue.enqueue(b.returnString());
        }
        long finish = System.nanoTime();
        b.close();
        System.out.println("Creacion  de cola simplemente enlazada:" +  (finish - start) );
        return queue;
    }
    
    static void deleteQueueSinglylinkedList(int n,Queue_using_SinglyLinkedList<String[]> queue ){
        long start = System.nanoTime();
            for(int i = 1; i<n; i++){
                queue.dequeue();
            }
        long finish = System.nanoTime();
        System.out.println("Desencolar de cola simplemente enlazada: " +  (finish - start) );
    }
    
    static void printQueueSinglyLinkedList(int n, Queue_using_SinglyLinkedList<String[]> queue){
        long start = System.nanoTime();
        for(int i = 1; i<n; i++){
            System.out.println(Arrays.toString(queue.dequeue()));
        }
        long finish = System.nanoTime();
        System.out.println("Impresión de cola simplemente enlazada: " +  (finish - start) );
    }
    
    static String[] findQueueSinglyLinkedList(int index,String data, Queue_using_SinglyLinkedList<String[]> queue){
        long start = System.nanoTime();
        int size = queue.size();
        String[] aux = null;
        for(int i = 0; i<size; i++){
            if (queue.peek()[index].equals(data)){
                aux = queue.dequeue();
                System.out.println(Arrays.toString(aux));
            }else{
               queue.dequeue();
            }    
        }
        long finish = System.nanoTime();
        System.out.println("Encontrado en cola simplemente enlazada: " +  (finish - start) );
        return aux;
    }
    
    static queue_using_arrays createQueueArray(int tamaño){
        long TInicio, TFin, tiempo;
        TInicio = System.nanoTime();
        paraleer prueba = new paraleer();
        String[] aux;
        queue_using_arrays<String[]> queue =new queue_using_arrays<>(tamaño);
        for (int i = 0; i < tamaño; i++) {
            aux = prueba.returnString();
            //while((aux=prueba.returnString())!=null){
            queue.enqueue(aux);
        }
        TFin = System.nanoTime();
        tiempo = TFin - TInicio;
        System.out.println("Creacion pila en arreglo en: " +  tiempo );
        return queue;
    }
    
    static String[] findQueueArray(int index, String data, queue_using_arrays queue){
        long TInicio, TFin, tiempo;
        TInicio = System.nanoTime();
        String[] compare = null;
        boolean a=true;
        while (a && !queue.empty()){
          compare= (String[])queue.dequeue();
            if  (compare[index].equals(data)){
                a=false;
            }
        }
        TFin = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("cola encontrar Tiempo de ejecución en milisegundos: " + tiempo);
        System.out.println("cola encontrar Tiempo de ejecución en segundos: buscando " + tiempo/1e9);
        return compare;
    }
    
    static void deleteQueueArray(queue_using_arrays queue){
        long TInicio, TFin, tiempo;
        TInicio = System.nanoTime(); 
        while (!queue.empty()) {
            //System.out.println(Arrays.toString((String[])queue.dequeue()));
            queue.dequeue();
        }
        TFin = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("cola eliminacion Tiempo de ejecución en nanosegundos: " + tiempo);
        System.out.println("cola eliminacion Tiempo de ejecución en segundos: " + tiempo/1e9);
        
    }
    
    static Stack_using_arrays createStackArray(int tamaño){
        long TInicio, TFin, tiempo;
        TInicio = System.nanoTime(); 
        paraleer prueba = new paraleer();
        String[] aux;
        Stack_using_arrays<String[]> stack =new Stack_using_arrays<>(tamaño);
        for (int i = 0; i < tamaño; i++) {
            aux = prueba.returnString();
            //while((aux=prueba.returnString())!=null){
            stack.push(aux);
        }
        TFin = System.nanoTime(); 
        tiempo = TFin - TInicio;
        System.out.println("Creacion pila en arreglo en(nanosegundos): " +  tiempo );
        return stack;
    }
    
    static String[] findStackArray(int index, String data,Stack_using_arrays stack){
        //buscar dato
        long TInicio, TFin, tiempo;
        TInicio = System.nanoTime(); 
        //String dato ="SB11201820578487";
        String[] compare = null;
        boolean a=true;
       
        while (a && !stack.empty()){
          compare= (String[])stack.pop();
            if  (compare[index].equals(data)){
                a=false;
            }
        }
        TFin = System.nanoTime();  //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("Busqueda pila en arreglo. Tiempo de ejecución en nanosegundos: " + tiempo);
        System.out.println("Busqueda pila en arreglo Tiempo de ejecución en segundos: " + tiempo/1e9);
        return compare;
    }
    
    static void deleteStackArray(Stack_using_arrays stack){
        long TInicio, TFin, tiempo;
        TInicio = System.nanoTime(); 
        while (!stack.empty()) {
            //System.out.println(Arrays.toString((String[])queue.dequeue()));
            stack.pop();
        }
        TFin = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("pila eliminacion Tiempo de ejecución en nanosegundos: " + tiempo);
        System.out.println("pila eliminacion Tiempo de ejecución en segundos: " + tiempo/1e9);
        
    }
    
    static void pasarGarbageColector(){
        Runtime garbage = Runtime.getRuntime();
        garbage.gc();
    }
    
     public static void main(String[] args) {        
        
        Stack_using_DoublyLinkedList<String[]> stack;
        Queue_using_DoublyLinkedList<String[]> queue;
        Stack_using_SinglyLinkedList<String[]> stackSingly;
        Queue_using_SinglyLinkedList<String[]> queueSingly;
        Stack_using_arrays stackArray;
        queue_using_arrays queueArray;
        int[] test = {549934};//40,400,4000,40000,400000,549934
        String data = "SB11201820060253";
        Pruebas p = new Pruebas();
        /*
        for(int i: test){
            System.out.println("---------------------Test con " + i*25 +" "
                    + "elementos--------------------------------");
            stack = createStackDoublylinkedList(i);
            findStackDoublyLinkedList(4,data,stack);
            stack = createStackDoublylinkedList(i);
            deleteStackDoublyLinkedList(i,stack);
        }    
            
        for(int i: test){
            System.out.println("---------------------Test con " + i*25 +" "
                    + "elementos--------------------------------");    
            queue = createQueueDoublyLinkedList(i);
            findQueueDoublyLinkedList(4,data,queue);
            queue = createQueueDoublyLinkedList(i);
            deleteQueueDoublylinkedList(i,queue);
        }
            
        pasarGarbageColector();
            
        for(int i: test){
            System.out.println("---------------------Test con " + i*25 +" "
                    + "elementos--------------------------------");    
            stackSingly = createStackSinglylinkedList(i);
            findStackSinglyLinkedList(4,data,stackSingly);
            stackSingly = createStackSinglylinkedList(i);
            deleteStackSinglyLinkedList(i,stackSingly);
        }   
            
            
        for(int i: test){
            System.out.println("---------------------Test con " + i*25 +" "
                    + "elementos--------------------------------");    
            queueSingly = createQueueSinglyLinkedList(i);
            findQueueSinglyLinkedList(4,data,queueSingly); 
            queueSingly = createQueueSinglyLinkedList(i);
            deleteQueueSinglylinkedList(i,queueSingly);
            
        }
        
        pasarGarbageColector();
        
        for(int i: test){
            System.out.println("---------------------Test con " + i*25 +" "
                    + "elementos--------------------------------");    
            stackArray = createStackArray(i);
            findStackArray(4,data,stackArray);
            stackArray = null;
            stackArray = createStackArray(i);
            deleteStackArray(stackArray);
        }   
            
            
            
        for(int i: test){
            System.out.println("---------------------Test con " + i*25 +" "
                    + "elementos--------------------------------");    
            
            queueArray = createQueueArray(i);
            findQueueArray(4,data,queueArray);
            queueArray = null;
            queueArray = createQueueArray(i);
            deleteQueueArray(queueArray);
        }       
        */  
         pasarGarbageColector();   
       
        SinglyLinkedList list;
        for(int i: test){
            System.out.println("---------------------Test con " + i*25 +" "
                    + "elementos--------------------------------");    
             
            int numOfLines = i;
            System.out.println("================Singly-Linked List================");
            list = p.SinglyPushBack(numOfLines);
            p.SinglyPopBack(numOfLines,list);
            p.SinglyPopFront(numOfLines, list);
            p.SinglySort(numOfLines, list);
            list = null;
            pasarGarbageColector();
            list = p.SinglyPushFront(numOfLines);
            //p.SinglyAddAfter(numOfLines);//lista, y dato o nodo
            //p.SinglyAddBefore(numOfLines);//lista y dato o nodo
            //p.SinglyFind(numOfLines,data);//lista
            //p.SinglyInsertMitad(numOfLines);//lista y o el dato, o nodo
            //p.SinglyDelete(numOfLines, list);// lita y el dato a eliminar
            
        }
        
        pasarGarbageColector();
        /*
        DoublyLinkedList list2;
        for(int i: test){
            System.out.println("---------------------Test con " + i*25 +" "
                    + "elementos--------------------------------");
            int numOfLines = i;
            System.out.println("================Doubly-Linked List================");
            list2 = p.DoublyPushBack(numOfLines);
            p.DoublyPopBack(numOfLines,list2);
            p.DoublyPopFront(numOfLines, list2);
            p.DoublySort(numOfLines, list2);
            pasarGarbageColector();
            list2 = p.DoublyPushFront(numOfLines);
            p.DoublyAddAfter(numOfLines);
            p.DoublyAddBefore(numOfLines);
            p.DoublyFind(numOfLines,data);
            p.DoublyInsertMitad(numOfLines);
            p.DoublyDelete(numOfLines, list2);
        }
        */
       
      
    }
}
