
package Reserva_vuelos;

public class Reserva {
  
    String NumeroReserva;
    String Origen;
    String Destino;
    String HoraVuelo;
    String FechaVuelo;
    String NumeroSilla;
    String NumeroVuelo;
    String ValorTiquete;
    String NombreCliente;
    String ApellidoCliente;
    String FechaNacimiento;
    String Cedula;
    String TelefonoContacto;
    String CelularContacto;
    String EmailContacto;
    String FechaCompra;
    String OpcionPago;
  
    public Reserva(String NumeroReserva, String Origen, String Destino, String HoraVuelo, String FechaVuelo, String NumeroSilla, String NumeroVuelo, String ValorTiquete, String NombreCliente, String ApellidoCliente, String FechaNacimiento, String Cedula, String TelefonoContacto, String CelularContacto, String EmailContacto, String FechaCompra, String OpcionPago) {
        this.NumeroReserva = NumeroReserva;
        this.Origen = Origen;
        this.Destino = Destino;
        this.HoraVuelo = HoraVuelo;
        this.FechaVuelo = FechaVuelo;
        this.NumeroSilla = NumeroSilla;
        this.NumeroVuelo = NumeroVuelo;
        this.ValorTiquete = ValorTiquete;
        this.NombreCliente = NombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.FechaNacimiento = FechaNacimiento;
        this.Cedula = Cedula;
        this.TelefonoContacto = TelefonoContacto;
        this.CelularContacto = CelularContacto;
        this.EmailContacto = EmailContacto;
        this.FechaCompra = FechaCompra;
        this.OpcionPago = OpcionPago;
    }
    public String toString() {
         return "\n         DATOS DE LA RESERVA      \n"
                + "\nNumero de Reserva: " + this.NumeroReserva                
                + "\nOrigen: " + this.Origen
                + "\nDestino: " + this.Destino
                + "\nHora Vuelo: " + this.HoraVuelo
                + "\nFecha Vuelo: " + this.FechaVuelo
                + "\nNumero de Silla: " + this.NumeroSilla
                + "\nNumero de Vuelo: " + this.NumeroVuelo
                + "\nValor Tiquete: " + this.ValorTiquete
                + "\nNombre Cliente: " + this.NombreCliente
                + "\nApellido Cliente : " + this.ApellidoCliente
                + "\nFecha de Nacimiento: " + this.FechaNacimiento
                + "\nCedula: " + this.Cedula
                + "\nTelefono de Contacto: " + this.TelefonoContacto
                + "\nCelular de Contacto: " + this.CelularContacto
                + "\nEmail de Contacto: " + this.EmailContacto
                + "\nFecha de Compra: " + this.FechaCompra
                + "\nOpcio de Pago : " + this.OpcionPago;
    }

    public String getNumeroReserva() {
        return NumeroReserva;
    }

    public void setNumeroReserva(String NumeroReserva) {
        this.NumeroReserva = NumeroReserva;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getHoraVuelo() {
        return HoraVuelo;
    }

    public void setHoraVuelo(String HoraVuelo) {
        this.HoraVuelo = HoraVuelo;
    }

    public String getFechaVuelo() {
        return FechaVuelo;
    }

    public void setFechaVuelo(String FechaVuelo) {
        this.FechaVuelo = FechaVuelo;
    }

    public String getNumeroSilla() {
        return NumeroSilla;
    }

    public void setNumeroSilla(String NumeroSilla) {
        this.NumeroSilla = NumeroSilla;
    }

    public String getNumeroVuelo() {
        return NumeroVuelo;
    }

    public void setNumeroVuelo(String NumeroVuelo) {
        this.NumeroVuelo = NumeroVuelo;
    }

    public String getValorTiquete() {
        return ValorTiquete;
    }

    public void setValorTiquete(String ValorTiquete) {
        this.ValorTiquete = ValorTiquete;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getApellidoCliente() {
        return ApellidoCliente;
    }

    public void setApellidoCliente(String ApellidoCliente) {
        this.ApellidoCliente = ApellidoCliente;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTelefonoContacto() {
        return TelefonoContacto;
    }

    public void setTelefonoContacto(String TelefonoContacto) {
        this.TelefonoContacto = TelefonoContacto;
    }

    public String getCelularContacto() {
        return CelularContacto;
    }

    public void setCelularContacto(String CelularContacto) {
        this.CelularContacto = CelularContacto;
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

    public String getOpcionPago() {
        return OpcionPago;
    }

    public void setOpcionPago(String OpcionPago) {
        this.OpcionPago = OpcionPago;
    }
    
    
}
