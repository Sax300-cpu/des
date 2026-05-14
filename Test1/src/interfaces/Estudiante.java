/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String estCedula;
    private String estNombre;
    private String estApellido;
    private String estDireccion;
    private String estTelefono;

    public Estudiante(String estCedula, String estNombre, String estApellido, String estDireccion, String estTelefono) {
        this.estCedula = estCedula;
        this.estNombre = estNombre;
        this.estApellido = estApellido;
        this.estDireccion = estDireccion;
        this.estTelefono = estTelefono;
    }

    public String getEstCedula() {
        return estCedula;
    }

    public void setEstCedula(String estCedula) {
        this.estCedula = estCedula;
    }

    public String getEstNombre() {
        return estNombre;
    }

    public void setEstNombre(String estNombre) {
        this.estNombre = estNombre;
    }

    public String getEstApellido() {
        return estApellido;
    }

    public void setEstApellido(String estApellido) {
        this.estApellido = estApellido;
    }

    public String getEstDireccion() {
        return estDireccion;
    }

    public void setEstDireccion(String estDireccion) {
        this.estDireccion = estDireccion;
    }

    public String getEstTelefono() {
        return estTelefono;
    }

    public void setEstTelefono(String estTelefono) {
        this.estTelefono = estTelefono;
    }
    
    
}