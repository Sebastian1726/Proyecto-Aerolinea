package Reserva_vuelos;

import java.util.Date;

public class Cliente extends Persona {

    String FechaCompra;
    String FormaPago;
    String NombreContacto;
    String TelefonoContacto;
    String EmailContacto;

    public Cliente( String FechaCompra, String FormaPago, String NombreContacto, String TelefonoContacto, String EmailContacto, String Cedula, String Nombre, String Apellido, String FechaNacimiento, String Telefono, String Celular, String Email) {
        super(Cedula, Nombre, Apellido, FechaNacimiento, Telefono, Celular, Email);
        this.FechaCompra = FechaCompra;        
        this.FormaPago = FormaPago;
        this.NombreContacto = NombreContacto;
        this.TelefonoContacto = TelefonoContacto;
        this.EmailContacto = EmailContacto;
    }    
    

    public String toString() {
         return "\n         DATOS DEL CLIENTE      \n"
                + "\nCedula: " + getCedula()
                + "\nNombre: " + getNombre()
                + "\nApellido: " + getApellido()
                + "\nFecha de Nacimiento: " + getFechaNacimiento()
                + "\nTelefono: " + getTelefono() 
                + "\nCelular: " + getCelular()
                + "\nEmail: " + getEmail()
                + "\nFecha de Compra: " + this.FechaCompra                
                + "\nForma de Pago: " + this.FormaPago
                + "\nNombre de Contacto: " + this.NombreContacto
                + "\nTelefono de Contacto: " + this.TelefonoContacto
                + "\nEmail de Contacto: " + this.EmailContacto;   
    }
    
    
    public String getNombreContacto() {
        return NombreContacto;
    }

    public void setNombreContacto(String NombreContacto) {
        this.NombreContacto = NombreContacto;
    }

    public String getTelefonoContacto() {
        return TelefonoContacto;
    }

    public void setTelefonoContacto(String TelefonoContacto) {
        this.TelefonoContacto = TelefonoContacto;
    }

    public String getEmailContacto() {
        return EmailContacto;
    }

    public void setEmailContacto(String EmailContacto) {
        this.EmailContacto = EmailContacto;
    }     

    public String getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(String FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    
    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }

    
    
    
    
}
