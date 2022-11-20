/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_Transportes;

/**
 *
 * @author HP
 */
public class RunPractica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Automovil auto = new Automovil(15.6);
        auto.modelo = "Audi";
        auto.combustible = "Electrico/Gasolina";
        auto.asientos = 4;
        auto.puertas = 4;
        auto.ventanas = 4;
        auto.velocidadMax = "220km/h";
        
        auto.aumentarKilometraje();
        System.out.println("Kilometraje: "+auto.getKilometraje());
        System.out.println("Modelo: "+auto.modelo);
        System.out.println("combustible: "+auto.combustible);        
        System.out.println("Asientos: "+auto.asientos);
        System.out.println("Puertas: "+auto.puertas);
        System.out.println("Ventanas: "+auto.ventanas);
        System.out.println("Velociad Maxima: "+auto.velocidadMax);

        System.out.println("\n");
        
        Avion avion = new Avion(15);
        avion.modelo = "Air Force One";
        avion.combustible = "Electrico/Gasolina";
        avion.asientos = 102;
        avion.puertas = 2;
        avion.ventanas = 102;
        avion.velocidadMax = "1037km/h";
        
        System.out.println("Modelo: "+avion.modelo);
        System.out.println("combustible: "+avion.combustible);        
        System.out.println("Asientos: "+avion.asientos);
        System.out.println("Puertas: "+avion.puertas);
        System.out.println("Ventanas: "+avion.ventanas);
        System.out.println("Velociad Maxima: "+avion.velocidadMax);
        
        System.out.println("\n");
        
        Tren tren = new Tren(20.5);
        tren.modelo = "Shinkansen E5";
        tren.combustible = "Electrico/Gasolina";
        tren.asientos = 731;
        tren.puertas = 26;
        tren.ventanas = 731;
        tren.velocidadMax = "320km/h";
        
        System.out.println("Modelo: "+tren.modelo);
        System.out.println("combustible: "+tren.combustible);        
        System.out.println("Asientos: "+tren.asientos);
        System.out.println("Puertas: "+tren.puertas);
        System.out.println("Ventanas: "+tren.ventanas);
        System.out.println("Velociad Maxima: "+tren.velocidadMax);        
        tren.cambiarRiel("izquierdo");
        
        
        tren.cambiarRiel("derecho");
        
    }
}

