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
public class Tren extends Vehiculo {
    
   public Tren(){
        
    }
    
    public Tren(int gas){
        System.out.println(encenderTren(gas));
        System.out.println(avanzar(gas));
    }
    
    public Tren(double carga){
        
    }
    private String encenderTren(int gas){
        if(gas>1){
            return "Tren encendido.";
        }
        else{
            return "Gasolina insuficiente.";
        }
        
    }

    private String avanzar(int gas){
        if(gas>1 && gas < 10)
            return "Bajo nivel de combustible.";
        else
            return "Avanzando...";
        }
    
    public void cambiarRiel(String direccion){
        System.out.println( "Cambiando hacia el riel "+direccion);
    }
        
}
