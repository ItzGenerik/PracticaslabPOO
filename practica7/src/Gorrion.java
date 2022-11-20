/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Gorrion extends Animal implements Ivolar{
    // Implementar interfaz volar
    
    Gorrion(String Nombre, int Edad, String Comida){
        this.setNombre(Nombre);
        this.setEdad(Edad);
        
        System.out.println(comer(Comida));
    }    
    
    @Override
    public String volar(){
        return "El gorrion comanzo a volar";
    }
    
    
    private String comer(String comida){
        return "Gorrion comiendo "+comida;
    }

    @Override
    public String caminar(double caminar) {
        return "El gorrion camino una distancia de "+caminar+" metros";
    }
}
