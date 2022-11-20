/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class runPractica7 {

    /**
     * @param args the command line arguments
     */
    static double distancia = 0; 
    
    public static void main(String[] args) {
        // TODO code application logic here
               
        Scanner Scan = new Scanner(System.in);
        
        Gato gato = new Gato("Calico","Manchas",5,"Carne enlatada");
        Perro perro = new Perro("Oddie",12,"Gris","Filete");
        Jaguar jaguar = new Jaguar("Jaguar",10,"Carne");
        Cocodrilo cocodrilo = new Cocodrilo("Cocodrilo",7,"Carne");
        Gorrion gorrion = new Gorrion("Gorrion",4,"Semillas");
        
        
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(perro);
        animales.add(gato);
        animales.add(jaguar);
        animales.add(cocodrilo);
        animales.add(gorrion);
        


        
        for(Animal animal: animales){
            System.out.println("Distancia a recorrer por "+animal.getNombre()+":");
            var dist = Scan.nextDouble();
            distancia += dist;
            System.out.println(animal.caminar(dist));    
        }
        distancia /= animales.size();

        System.out.println("Distancia promedio recorrida: "+distancia);
        
        
        System.out.println("\n"+gato.getNombre() + ", "+ gato.getRaza() + ", Edad: "+ gato.getEdad()); 
        System.out.println(gato.maullar());
        
        System.out.println("\n"+perro.getNombre() + ", "+ perro.color + ", Edad: "+ perro.getEdad()); 
        System.out.println(perro.ladrar());
        
        System.out.println("\n"+cocodrilo.getNombre()+", Edad: "+cocodrilo.getEdad());
        System.out.println(cocodrilo.nadar());
        
        System.out.println("\n"+jaguar.getNombre()+", Edad: "+jaguar.getEdad());
        System.out.println(jaguar.Cazar());
        
        System.out.println("\n"+gorrion.getNombre()+", Edad: "+gorrion.getEdad());
        System.out.println(gorrion.volar());        
        
        
    }
    
    
}
