/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public abstract class Animal{
    
    private int edad;
    private String nombre;

    public int getEdad(){
        return edad;
    }


    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }    
    public abstract String caminar(double caminar);
}
