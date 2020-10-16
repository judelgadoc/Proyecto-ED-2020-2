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
     */   
    public static void main(String[] Args){
        paraleer pl = new paraleer();
        System.out.println(pl.existe());
        //String[] a = pl.returnString().toString();
        Stack pila = new Stack();
        String[] aux;
        //int aux1 = 500000;
        while((aux = pl.returnString())!=null){//&&aux1-->0){
            pila.add(aux);
            
        }
        int size = pila.size();
        for (int i = 0;i<size;i++){
            System.out.println(Arrays.toString((String[])pila.pop()));
        }   
    }
}
