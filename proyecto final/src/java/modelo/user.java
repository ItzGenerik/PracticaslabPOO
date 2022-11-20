/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Karlo Jair
 */
public class user {

    /**
     * @return the Matricula
     */
    public int getMatricula() {
        return Matricula;
    }

    /**
     * @param Matricula the Matricula to set
     */
    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    /**
     * @return the Semestre
     */
    public int getSemestre() {
        return Semestre;
    }

    /**
     * @param Semestre the Semestre to set
     */
    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    /**
     * @return the promedio
     */
    public float getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    private String Apellido;
    private String Nombre;
    private int Matricula;
    private int Semestre;
    private float promedio;
    
    
    public String regresar(){
        return "<button onclick=\"document.location='home.html'\">Regresar a la pagina principal</button>";
    }
}
