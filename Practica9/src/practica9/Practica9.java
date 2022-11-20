/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica9;

/**
 *
 * @author karlo
 */
public class Practica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person persona = new Person("Jair","Bahia");
        Person estudiante = new Student("Karlo","Bahia","FCFM",2022,6000);
        Person staff = new Staff("Lucio","XXXX","FCFM",6000);
        
        System.out.println(persona.toString());
        System.out.println(estudiante.toString());
        System.out.println(staff.toString());
        
        
        
    }
    
}
