/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Jaguar extends Animal{
    // Implementar interfaz volar
    
    Jaguar(String Nombre, int Edad, String Comida){
        this.setNombre(Nombre);
        this.setEdad(Edad);
        
        System.out.println(comer(Comida));
    }    
    
    
    public String Cazar(){
        return this.getNombre() + "comenzo a cazar";
    }
    
    private String comer(String comida){
        return "Jaguar comiendo "+comida;
    }

    @Override
    public String caminar(double caminar) {
        return "El Jaguar camino una distancia de "+caminar+" metros";
    }
}
