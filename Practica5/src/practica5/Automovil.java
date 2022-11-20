/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

/**
 *
 * @author HP
 */
public class Automovil extends Automotor{



    private String color;
    private double precio;
    private int gas; 
    
    Automovil(String Modelo, String Marca, String Color, double Precio, int Gas){
        this.setMarca(Marca);
        this.setModelo(Modelo);
        this.precio = Precio;
        this.color = Color;
        this.gas = Gas;
    }
    
    public int getGas() {
        return gas;
    }
    
    public Double getPrecio(){
        return this.precio;
    }
    public String getColor(){
        return this.color;
    }    


    public String avanza(double gas){
        return verificarGas(gas, "Avanzando");
    }
    public String avanzaDerecha(double gas){
        return verificarGas(gas, "Avanzando a la derecha");
    }
    public String avanzaIzquierda(double gas){
        return verificarGas(gas, "Avanzando a la izquierda");
    }
    
    public String verificarGas(double gas, String text){
    if (gas > 1){
            this.gas--;
            
            return text + "\n Gasolina: "+this.gas;
        }
        return "Sin gasolina suficiente";
    }
    
}
