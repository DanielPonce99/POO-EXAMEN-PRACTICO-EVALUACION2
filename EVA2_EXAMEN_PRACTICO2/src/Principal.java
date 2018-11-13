
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
           ANA CAROLINA AMAYA MUELA
 * @author ANTELMO ESCARCEGA FUENTES 
 *         DANIEL ELIAS YAÑEZ PONCE
 *         CESAR ALEJANDRO CHAVEZ VILLA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sedan sed = new Sedan(); 
        Motocicleta moto = new Motocicleta(); 
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("¿Con cual vehículo cuenta?"
                + "\n 1)Sedan"
                + "\n 2)Motocicleta");
        int op = input.nextInt();
        
        switch(op){ 
            
            case 1: 
                sed.setVelocidad(80); 
                sed.setCantidadPasajeros(4);
                sed.setSonido(200); 
                sed.setBocinas(3); 
                sed.setNumeroRuedas(4);
                sed.setTipoTransmision(tipoTransmision.Manual); 
           
                sed.Acelerar();
                sed.Acelerar();
                sed.Acelerar();
                sed.Acelerar();
                
                sed.Frenar();
                sed.Acelerar();
                estacionar(sed, sed.getVelocidad());
                System.out.println(sed.getTexto());
                break;
                
            case 2: 
                moto.setVelocidad(80); 
                moto.setCantidadPasajeros(2); 
                moto.setNumeroRuedas(2); 
                moto.setTipoTransmision(tipoTransmision.Automatico); 
                moto.Acelerar();
                moto.Acelerar();
                moto.Acelerar();
                moto.Frenar();
                moto.Acelerar();
                estacionar(moto, moto.getVelocidad());
                
                System.out.println(moto.getTexto());
                break;
                
            default: 
                System.out.println("ERROR" + "\nVehículo no disponible");
        }
           
    }
    
    
    public static void estacionar(Vehiculo arg, int velocidad) {
        String tipoVehi; 
        
        arg.Acelerometro(); 
    
        if (arg instanceof Sedan){ 
            tipoVehi = "Vehículo tipo Sedan"; 
            System.out.println(tipoVehi); 
        }
    
        else { 
            tipoVehi = "Vehículo tipo Motocicleta";
            System.out.println(tipoVehi); 
        }
        while(arg.getVelocidad()!=0){ 
        arg.Frenar();} 
        
        arg.Acelerometro(); 
    }
    
}
