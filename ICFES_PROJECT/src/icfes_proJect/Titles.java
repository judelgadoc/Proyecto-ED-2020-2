package icfes_proJect;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Titles {
    private String[] arr;
    FileReader fr;
    BufferedReader br;

    public Titles() {
        try {
         this.arr = new BufferedReader(new FileReader("Titles_SB11_2018-2.txt")).readLine().split(";");
        }catch (Exception e){
            System.out.println("Error al leer el archivo");
            
        }
    }
    public int getIndexOf(String key) {
        int ans = 0;
        while (!arr[ans].equals(key))
            ans++;
        return ans;
    }
    public void close() {
        try{                    
            if(null != this.fr)   
               this.fr.close();                  
        }catch (Exception e2){ 
            e2.printStackTrace();
        }
    }
}
