/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;

import java.util.ArrayList;

/**
 *
 * @author jorgeislas
 */
public class RunPractica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Telefono tl = new Telefono();
        Computadora cp = new Computadora();

        ArrayList<ComponenteElectronico> al = new ArrayList<ComponenteElectronico>();
        
        al.add(tl);
        al.add(cp);

        //ComponenteElectronico o = new Telefono();
        //ComponenteElectronico o = new Computadora();
        for (ComponenteElectronico o : al ){
            System.out.println(o.encender());
        
        }
        
        
    }
    
}
