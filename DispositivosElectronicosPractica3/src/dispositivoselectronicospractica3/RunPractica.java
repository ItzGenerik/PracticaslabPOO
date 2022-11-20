/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dispositivoselectronicospractica3;

/**
 *
 * @author HP
 */
public class RunPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Telefono tel = new Telefono();
        Calculadora cal = new Calculadora();
        
        tel.setMarca("Umidigi");
        tel.modelo = "Power 5";
        tel.setColor("Azul");
             
        
        System.out.println("Telefono "+tel.getMarca()+" "+tel.modelo+" "+tel.getColor());
        tel.encender();
        String contacto = "Karlo";
        //int numero = 987622434;   
        System.out.println(tel.buscarContacto(contacto));
        System.out.println(tel.hacerLlamada(contacto));
        System.out.println(tel.terminaLlamada());
        
        System.out.println("Suma de 25+25: "+tel.suma(25, 25));
        System.out.println("Reste de 34-10: "+tel.resta(34, 10));
        System.out.println("Multiplicacion de 10*2: "+tel.multiplicacion(10, 2));
        System.out.println("Division de 125/3: "+tel.division(125, 3));
        
        cal.setMarca("Casio");
        cal.setModelo("fx 991ex");
        cal.setColor("Negro");
        
        System.out.println("\nCalculadora "+cal.getMarca()+" "+cal.getModelo()+" "+cal.getColor());
        

        System.out.println("Suma de 5+5: "+cal.suma(5, 5));
        System.out.println("Reste de 5-5: "+cal.resta(5, 5));
        System.out.println("Multiplicacion de 5*5: "+cal.multiplicacion(5, 5));
        System.out.println("Division de 5/5: "+cal.division(5, 5));   
        
        System.out.println("\nRaiz de 100: "+ cal.raiz(100));
        System.out.println("Potencia de 30 a 3: "+ cal.potencia(30, 3));
        System.out.println("Sen de 50: "+ cal.seno(50));
        System.out.println("Cos de 25: "+ cal.cos(25));
        System.out.println("Tan de 90: "+ cal.tan(90));        

    }
    
}
