/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icfes_proJect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 *
 * @author maleja
 */
public class paraleer {
    //private static final Scanner scanner = new Scanner(System.in);
    File archivo;
    String[] array;
    FileReader fr;
    BufferedReader br;
    
    
    
    public paraleer(){
        //  this.array = new String[25];
        try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         
         this.archivo = new File ("2018-2.TXT");
         this.fr = new FileReader (archivo);
         this.br = new BufferedReader(fr);
        }catch (Exception e){
            System.out.println("Error al leer el archivo");
            
        }
    }
    public paraleer(String periodo){
        
        try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         periodo += ".txt";
         this.archivo = new File (periodo);
         this.fr = new FileReader (archivo);
         this.br = new BufferedReader(fr);
        }catch (Exception e){
            System.out.println("Error al leer el archivo");
            
        }
    }
    
    
    
    public String[] returnString(){
        
        String linea;
        try{
            linea=this.br.readLine(); 
            this.array = linea.split(";");
            return this.array;
        }catch(Exception e){
            
        }
        return null;
    }
    
     public String[] returnString(LinkedList<String> titSelected, Titles titFull){
         String linea;
        try{
            linea=this.br.readLine(); 
            String[] auxArray = linea.split(";");
            int[] auxInd = new int[titSelected.size()];
            int index = 0;   
            for (String i: titSelected){
                //System.out.print(i + " ");
                auxInd[index++] = titFull.getIndexOf(i);
            }
            this.array = new String[titSelected.size()];
            for (int i =0;i<array.length;i++){
                array[i]= auxArray[auxInd[i]];
            }
            return this.array;
        }catch(Exception e){
            System.out.println("returnString(linked,Titles): " + e);
        }
        return null;
     }
    
    
    
    
    public void close(){
        try{                    
            if( null != this.fr ){   
               this.fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
    }
    
    public boolean existe(){
        return this.archivo.exists();
    }
}
