/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Gato extends Animal{


    public String getRaza(){
        return raza;
    }
    private String raza;
    
    Gato(String Raza, String Nombre, int Edad, String Comida){
        this.setNombre(Nombre);
        this.setEdad(Edad);
        this.raza = Raza;
        
        
        System.out.println(comer(Comida));
    }
    
    
    
    public String maullar(){
        return "El gato comenzo a maullar";
    }
    private String comer(String comida){
        return "Gato comiendo "+comida;
    }

    
    @Override
    public String caminar(double caminar) {
        return "El gato camino una distancia de "+caminar+" metros";
    }
}
