/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivoselectronicospractica3;

/**
 *
 * @author HP
 */
public class Telefono extends DispositivosElectronicos implements IoperacionesBasicas{
    
    public String modelo;
    
    public String hacerLlamada(int numero){
        return "Llamando "+Integer.toString(numero);
    }
    
    public String hacerLlamada(String contacto){
        return "Llamando a "+contacto;
    }
    
    public String terminaLlamada(){
        return "Llamada terminada.";
    }
    public String buscarContacto(String Contacto){
        return "Buscando el contacto"+ Contacto+"...";
    }

    @Override
    public String encender() {
        return "Telefono encendido.";
       
    }


    @Override
    public double suma(double a, double b){
    return a+b;
    }
    @Override
    public double resta(double a, double b){
        return a-b;
    }
    @Override
    public double division(double a, double b){
        return a/b;
    }
    @Override
    public double multiplicacion(double a, double b){
        return a*b;
    }  

    
}
