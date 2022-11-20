/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class practicaRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Automovil[] carro = new Automovil[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < carro.length; i++){
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Color: ");
            String color = sc.nextLine();
            System.out.print("precio: ");
            Double precio = sc.nextDouble();
            sc.nextLine();
            System.out.print("gasolina: ");
            int gasolina = sc.nextInt();
            sc.nextLine();
            carro[i] = new Automovil(modelo,marca,color,precio,gasolina);  
            
        }
        
        for(Automovil auto:carro){
            //audi = new Automovil();
 
            
        
            System.out.println(auto.getModelo() +" "+ auto.getMarca()+" "+ auto.getColor()+" "+ auto.getPrecio());
            System.out.println("Gasolina: "+ auto.getGas());
            
            if(auto.getGas() > 0){
                System.out.println("Auto encendido");
                
                System.out.println(auto.avanza(auto.getGas()));
                System.out.println(auto.avanzaDerecha(auto.getGas()));
                System.out.println(auto.avanzaIzquierda(auto.getGas()));
                
                System.out.println("Apagando vehiculo");
            }
            else
                System.out.println("Auto sin gasolina");
            

            }
            
        }
        
        
      
        
    }
    

