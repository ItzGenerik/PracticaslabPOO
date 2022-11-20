/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import java.util.Scanner;


/**
 *
 * @author karlo
 */
public class RunCalculadora {
    
    static Scanner sumObj = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        CalculadoraBasica casio = new CalculadoraBasica();
        CalculadoraCientifica casioCientifica = new CalculadoraCientifica();
         
        System.out.println("Calculadora Basica");
        System.out.println("Suma de 5+5: "+casio.suma(5, 5));
        System.out.println("Reste de 5-5: "+casio.resta(5, 5));
        System.out.println("Multiplicacion de 5*5: "+casio.multiplicacion(5, 5));
        System.out.println("Division de 5/5: "+casio.division(5, 5));
        
        System.out.println("\nCalculadora Cientifica");
        System.out.println("Suma de 5+5: "+casioCientifica.suma(5, 5));
        System.out.println("Reste de 5-5: "+casioCientifica.resta(5, 5));
        System.out.println("Multiplicacion de 5*5: "+casioCientifica.multiplicacion(5, 5));
        System.out.println("Division de 5/5: "+casioCientifica.division(5, 5));
        
        System.out.println("\nRaiz de 25: "+ casioCientifica.raiz(25));
        System.out.println("Potencia de 25 a 2: "+ casioCientifica.potencia(25, 2));
        System.out.println("Sen de 90: "+ casioCientifica.seno(90));
        System.out.println("Cos de 50: "+ casioCientifica.cos(50));
        System.out.println("Tan de 25: "+ casioCientifica.tan(25));

        
        
    }
 
}
