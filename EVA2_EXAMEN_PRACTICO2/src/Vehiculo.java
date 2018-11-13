/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *         ANA CAROLINA AMAYA MUELA
 * @author ANTELMO ESCARCEGA FUENTES 
 *         DANIEL ELIAS YAÑEZ PONCE
 *         CESAR ALEJANDRO CHAVEZ VILLA
 */
public class Vehiculo {
//Atributos privados
    private int numeroRuedas;
    private String tipoTransmision;
    private int cantidadPasajeros;
    private int velocidad;
    private String texto;

    
    public String getTexto() {
        String cadena = "Cantidad de pasajeros: " + cantidadPasajeros + "\n Número de llantas: " + numeroRuedas
                + "\n Tipo de transmisión: " + tipoTransmision;
        return cadena;
        
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    
    public void Acelerar(){
            velocidad = velocidad + 10;
            if(velocidad > 130){
                velocidad = 130;
            }
        }
    
 
    public void Frenar(){
            velocidad = velocidad - 10;
            
           
            if(velocidad < 0){
                velocidad = 0;
            }
    }
    
    public void Acelerometro(){
          
            if(velocidad > 0){
                System.out.println("Vehículo en movimiento: a " + velocidad + " km/hr");
            }
           
            else if (velocidad <= 0){
                velocidad = 0;
                System.out.println("Vehiculo detenido");
            }
        
    }
    
}

interface Tunneable{
    

    void setSonido(int sonido);
    int getSonido();
    
    void setBocinas(int bocinas);
    int getBocinas();
    
}


class Sedan extends Vehiculo implements Tunneable{
    //Atributos
    private int sonido = 0;
    private int bocinas = 0;
    
   
    @Override
    public String getTexto(){
        String cadena = "Cantidad de pasajeros: " + getCantidadPasajeros() + "\nNúmero de llantas: " + getNumeroRuedas()
                + "\nTipo de transmisión: " + getTipoTransmision() + "\nWatts de potencia: " + sonido
                + "\nCantidad de bocinas: " + bocinas;
        return cadena;
    }

    
    @Override
    public void setSonido(int sonido) {
        this.sonido = sonido;
    }

    @Override
    public int getSonido() {
        return this.sonido;
    }

    @Override
    public void setBocinas(int bocinas) {
        this.bocinas = bocinas;
    }

    @Override
    public int getBocinas() {
        return this.bocinas;
    }
    
}


class Motocicleta extends Vehiculo {
    
}

class tipoTransmision{
    public static final String Manual = "Manual";
    public static final String Automatico = "Automatico";
}
