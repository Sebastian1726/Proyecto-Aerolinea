
package Reserva_vuelos;

import java.util.Date;


public class Persona {
    private String Cedula;
    private String Nombre;
    private String Apellido;  
    private String FechaNacimiento;
    private String Telefono;
    private String Celular;
    private String Email;

    public Persona(String Cedula, String Nombre, String Apellido, String FechaNacimiento, String Telefono, String Celular, String Email) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.Email = Email;
    }
    
    public String toString() {
        return "\n "
                + "\nCedula: " + this.Cedula
                + "\nNombre: " + this.Nombre
                + "\nApellido: " + this.Apellido
                + "\nFechaNacimiento: " + this.FechaNacimiento
                + "\nTelefono: " + this.Telefono
                + "\nCelular: " + this.Celular
                + "\nEmail: " + this.Email;    
    }
    

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
    
    
}
