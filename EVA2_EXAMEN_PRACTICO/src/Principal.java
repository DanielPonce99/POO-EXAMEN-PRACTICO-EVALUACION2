
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
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
        Scanner sc = new Scanner(System.in);
        
       int op = 0;
        
        System.out.println("1. Ahorcado ");
        System.out.println("2. TicTacToe ");
        System.out.println("Elige un juego: ");
        op = sc.nextInt();
        switch(op){
            case 1:
                Ahorcado Llama = new Ahorcado();
                Llama.jugar();
               
                break;
            case 2: 
                TicTacToe LlamaOtro = new TicTacToe();
                LlamaOtro.jugar();
                break;
            default:
                System.out.println("");
                break;
                
        }
    }

  
    
    
}

abstract class Juego{
    public abstract void jugar();
    public abstract void salidaConsola();
}

interface CapturarAhorcado{
    public void capturarEntradaJugador();
}

interface capturaGato{
   public void capturarEntradaJugador(); 
}