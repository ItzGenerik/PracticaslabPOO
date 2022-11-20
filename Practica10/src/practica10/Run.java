/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica10;
import test.Calculadora;
import java.util.Scanner;

/**
 *
 * @author karlo
 */
public class Run {


    public static void main(String[] args) {
        Calculadora Cl = new Calculadora(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor 1:");
        double a = sc.nextDouble();
        System.out.println("Valor 2:");
        double b = sc.nextDouble();
        System.out.println("Suma de "+a+" y "+b+": "+Cl.suma(a, b));
        
        System.out.println("Valor 1:");
        a = sc.nextDouble();
        System.out.println("Valor 2:");
        b = sc.nextDouble();
        System.out.println("Resta de "+a+" y "+b+": "+Cl.resta(a, b));

        System.out.println("Valor 1:");
        a = sc.nextDouble();
        System.out.println("Valor 2:");
        b = sc.nextDouble();
        System.out.println("Multiplicacion de "+a+" y "+b+": "+Cl.multiplicacion(a, b));
 
        System.out.println("Valor 1:");
        a = sc.nextDouble();
        System.out.println("Valor 2:");
        b = sc.nextDouble();
        System.out.println("Divison de "+a+" y "+b+": "+Cl.division(a, b));        
    }
    
}
