/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_Transportes;

import vehiculos.Vehiculo;

/**
 *
 * @author HP
 */
public class Automovil extends Vehiculo {

    public int getKilometraje() {
        return kilometraje;
    }

    public void aumentarKilometraje() {
        this.kilometraje++ ;
    }
    
    private int kilometraje=0;
    
    public Automovil(){
        
    }
    
    public Automovil(int gas){
        System.out.println(encenderAutomovil(gas));
        System.out.println(avanzar(gas));
    }
    
    public Automovil(double carga){
        
    }
    private String encenderAutomovil(int gas){
        if(gas>1){
            return "Automovil encendido.";
        }
        else{
            return "Gasolina insuficiente.";
        }
        
    }
    
private String avanzar(int gas){
        if(gas>1 && gas < 10){
            return "Bajo nivel de combustible.\nAvanzando...";
            }
            return "Avanzando...";
        }
        
}
           

