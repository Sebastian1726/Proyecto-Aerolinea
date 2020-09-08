
package Reserva_vuelos;


public class Vuelos {
    
    String Origen;
    String Destino;
    String FechaVuelo;
    String HoraVuelo;
    String EstadoVuelo;
    String ValorTiquete;
    String NumeroVuelo;

    /**
     *
     * @param Origen
     * @param Destino
     * @param FechaVuelo
     * @param HoraVuelo
     * @param EstadoVuelo
     * @param ValorTiquete
     * @param NumeroVuelo
     */
    public Vuelos(String Origen, String Destino, String FechaVuelo, String HoraVuelo, String EstadoVuelo,String ValorTiquete, String NumeroVuelo) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.FechaVuelo = FechaVuelo;
        this.HoraVuelo = HoraVuelo;
        this.EstadoVuelo = EstadoVuelo;
        this.ValorTiquete = ValorTiquete;
        this.NumeroVuelo = NumeroVuelo;
    }   

    public Vuelos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        

    @Override
   public String toString() {
        return "\n         RUTAS   \n"
                
                + "\nOrigen: " + this.Origen
                + "\nDestino " + this.Destino
                + "\nFecha de Vuelo: " + this.FechaVuelo
                + "\nHora de Vuelo: " + this.HoraVuelo
                + "\nEstado de Vuelo: " + this.EstadoVuelo
                + "\nValor Tiquete: " + this.ValorTiquete
                + "\nNumero Vuelo: " + this.NumeroVuelo;
        
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
    
    public String getEstadoVuelo() {
        return EstadoVuelo;
    }

    public void setEstadoVuelo(String EstadoVuelo) {
        this.EstadoVuelo = EstadoVuelo;
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

    public String getFechaVuelo() {
        return FechaVuelo;
    }

    public void setFechaVuelo(String FechaVuelo) {
        this.FechaVuelo = FechaVuelo;
    }

    public String getHora() {
        return HoraVuelo;
    }

    public void setHora(String Hora) {
        this.HoraVuelo = Hora;
    }

    public String[] split(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String[] Split(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
    
    
    
}
