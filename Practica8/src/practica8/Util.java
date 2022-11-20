/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;
import java.io.*;

/**
 *
 * @author karlo
 */
public class Util {

    
    
    public void writeFile(String fileN, String text){
        try{
            FileWriter fw = new FileWriter(fileN); 
            fw.write(text);
            fw.close();
            System.out.println("El archivo se ha guardado exitosamente.");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
            
        
    }
    public void readFile(String fileN ){
        try{
            FileReader fr = new FileReader(fileN);
            
            int valor = fr.read();
            while(valor != -1){
                System.out.print((char)valor);
                valor = fr.read();
            }
            fr.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
