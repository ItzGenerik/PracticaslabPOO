/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica8;
import java.util.Scanner;
import java.io.File;

/**
 *
 * @author karlo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Util util = new Util(); 
        
        
        
        String folder = "C:\\Users\\karlo\\OneDrive\\Documentos\\NetBeansProjects\\Practica8\\src\\practica8\\";
        System.out.println("Nombre del archivo: ");
        String fileName = scan.nextLine();
        String file = folder+fileName;
        
        
        
        
        System.out.println("Texto: ");        
        String text = scan.nextLine();
        util.writeFile(file,text);
        
        util.readFile(file);

        
        

    }
    
}
