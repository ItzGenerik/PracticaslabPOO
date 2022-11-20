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
public class Avion extends Vehiculo {
    
   public Avion(){
        
    }
    
    public Avion(int gas){
        System.out.println(encenderAvion(gas));
        
        System.out.println(avanzar(gas));
    }
    
    public Avion(double carga){
        
    }
    private String encenderAvion(int gas){
        if(gas>1)
            return "Avion encendido.";
        else
            return "Gasolina insuficiente.";
        
        
    }

    private String avanzar(int gas){
        if(gas>1 && gas < 10)
            return "Bajo nivel de combustible.";
        else
            return "Avanzando...\n"+despegar()+".";
        
        
    }
    
    private String despegar(){
        return "Despegando.";
    }
}
