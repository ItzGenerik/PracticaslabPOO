/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Cocodrilo extends Animal{
    // Implementar interfaz volar
    
    Cocodrilo(String Nombre, int Edad, String Comida){
        this.setNombre(Nombre);
        this.setEdad(Edad);
        
        System.out.println(comer(Comida));
    }
    
    public String nadar(){
        return this.getNombre() + "comenzo a nadar";
    }
    
    
    private String comer(String comida){
        return "Cocodrilo comiendo "+comida;
    }

    @Override
    public String caminar(double caminar) {
        return "El cocodrilo camino una distancia de "+caminar+" metros";
    }
}
