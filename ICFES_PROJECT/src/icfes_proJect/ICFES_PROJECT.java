/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icfes_proJect;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author jalco
 */
public class ICFES_PROJECT {

    /**
     * @param args the command line arguments
     */    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        queue_using_arrays<String> icf =new queue_using_arrays<>(300000);
        File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         
         archivo = new File ("C:\\Users\\maleja\\Desktop\\SB11_20182.TXT");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         for(int i=0;i<300000;i++){
            if((linea=br.readLine())!=null)
                    icf.enqueue(linea);
          
                 }
         for (int i=0;i<300000;i++){
            System.out.println(icf.dequeue());           
        }
      }
      catch(Exception e){
         e.printStackTrace();
       
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
        
        queue_using_arrays<Integer> queue =new queue_using_arrays<>(10);
        for (int i=0;i<10;i++){
                       
            queue.enqueue(i);
        }
        
        for (int i=0;i<10;i++){
            System.out.println(queue.dequeue());           
        }
               
        System.out.println("hello");
         Stack_using_arrays<Integer> stack =new  Stack_using_arrays<>(10);
        for (int i=0;i<10;i++){
         
            stack.push(i);
        }       
        for (int i=0;i<10;i++){
            System.out.println(stack.pop());
            
        }
      
}}
