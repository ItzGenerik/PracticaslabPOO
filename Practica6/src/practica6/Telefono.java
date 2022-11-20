/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

/**
 *
 * @author jorgeislas
 */
public class Telefono extends ComponenteElectronico implements IOtrosComponentesE{

    @Override
    public String encender() {
        return "Telefono Encendido";
    }

    @Override
    public String apagar() {
        return "Telefono Apagado";
    }
    
}
