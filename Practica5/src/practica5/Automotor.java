/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

/**
 *
 * @author HP
 */
public class Automotor {


    private String Modelo;
    private String marca;
    
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.Modelo;
    }
    
    public void setModelo(String modelo){
        this.Modelo=modelo;
    }
    
    public void acelerar(double gas){
        if (gas > 1)
            System.out.println("Acelerando");
        else
            System.out.println("No hay suficiente gasolina");
    }
    public void frenar(){
        
    }            
}
