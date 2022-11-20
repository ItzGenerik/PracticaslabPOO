/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;
//import static java.lang.Math.*;

/**
 *
 * @author karlo
 */
public class CalculadoraCientifica extends OperacionesBasicas implements OperacionesAvanzadas {

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
