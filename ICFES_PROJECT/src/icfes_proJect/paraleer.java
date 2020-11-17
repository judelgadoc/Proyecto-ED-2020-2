/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icfes_proJect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

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
        this.array = new String[25];
        try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         
         this.archivo = new File ("SB11_2018-2.TXT");
         this.fr = new FileReader (archivo);
         this.br = new BufferedReader(fr);
        }catch (Exception e){
            System.out.println("Error al leer el archivo");
            
        }
    }
    public paraleer(String periodo){
        this.array = new String[25];
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
