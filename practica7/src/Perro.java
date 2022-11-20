/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Perro extends Animal{
    public String color;
    
    Perro(String Nombre, int Edad,String Color, String Comida){
        this.setNombre(Nombre);
        this.setEdad(Edad);
        this.color = Color;
        
        System.out.println(comer(Comida));
    }
    
    public String ladrar(){
        return "El perro comenzo a ladrar";
    }
    private String comer(String comida){
        return "perro comiendo "+comida;
    }

    @Override
    public String caminar(double caminar) {
        return "El perro camino una distancia de "+caminar+" metros";
    }
}
