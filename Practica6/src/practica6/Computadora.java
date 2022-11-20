/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

/**
 *
 * @author jorgeislas
 */
public class Computadora  extends ComponenteElectronico implements IOtrosComponentesE{

    @Override
    public String encender() {
        return "Computador Encendido";
    }

    @Override
    public String apagar() {
        return "Computador Apagado";
    }
       
}
