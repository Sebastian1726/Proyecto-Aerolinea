
package Reserva_vuelos;

public class Aviones {
    
    String NumeroVuelo;
    String NumeroSilla;
    String TipoAvion;
    String Combustible;
    

    public Aviones(String NumeroVuelo, String NumeroSilla, String TipoAvion, String Combustible) {
        this.NumeroVuelo = NumeroVuelo;
        this.NumeroSilla = NumeroSilla;
        this.TipoAvion = TipoAvion;
        this.Combustible = Combustible;
        
    }

    @Override
     public String toString() {
        return "\n "
                + "\nNumero de Vuelos: " + this.NumeroVuelo
                + "\nNumero de Sillas: " + this.NumeroSilla
                + "\nTipo de Avion: " + this.TipoAvion
                + "\nCombustible: " + this.Combustible;          
    
    }
    
    
    public String getNumeroVuelo() {
        return NumeroVuelo;
    }

    public void setNumerovuelo(String NumeroVuelo) {
        this.NumeroVuelo = NumeroVuelo;
    }

    public String getNumeroSilla() {
        return NumeroSilla;
    }

    public void setNumeroSilla(String NumeroSilla) {
        this.NumeroSilla = NumeroSilla;
    }

    public String getTipoAvion() {
        return TipoAvion;
    }

    public void setTipoAvion(String TipoAvion) {
        this.TipoAvion = TipoAvion;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

        

    
    
    
    
    
}
