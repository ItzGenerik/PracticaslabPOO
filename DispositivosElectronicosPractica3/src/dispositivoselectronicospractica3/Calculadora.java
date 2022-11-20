/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivoselectronicospractica3;

/**
 *
 * @author HP
 */
public class Calculadora extends DispositivosElectronicos implements IoperacionesBasicas, IoperacionesAvanzadas{

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String modelo;
    
    @Override
    public String encender() {
        return "Encendido";
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


    @Override
    public double raiz(double a){
        return Math.sqrt(a);
     }
   
    @Override
    public double potencia(double a,double b){
        return Math.pow(a,b);
    }
    @Override
    public double seno(double grados){
        return Math.sin(Math.toRadians(grados));
    }
    @Override
    public double cos(double grados){
        return Math.cos(Math.toRadians(grados));
    }
    @Override
    public double tan(double grados){
        return Math.tan(Math.toRadians(grados));
    }
    
}
