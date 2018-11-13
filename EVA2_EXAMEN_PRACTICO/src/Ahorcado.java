
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
class Ahorcado extends Juego implements CapturarAhorcado{

    @Override
    public void jugar() {
         Scanner sc = new Scanner (System.in);
 System.out.println("Cuentas con 5 vidas, Si la letra es correcta no pierdes vida");
        String [] palabras = { "Conalep", "COBACH", "CECyT 06", "Cbtis", "Caracol","Rayon"};
        int posicionale = (int) Math.floor(Math.random() * palabras.length);
        String palabra = palabras[posicionale];
        
        System.out.println("Adivina la palabra ");
        
        char [] letra = palabra.toCharArray();
        char [] letrasconguiones = new char[letra.length];    
        
        for (int i = 0; i < letra.length; i++) {
            letrasconguiones[i]='_';              //Cambiamos cada letra por guion por medio del char
        }
        
        System.out.println(letrasconguiones);
        boolean ganamos = false;
        int x=0;
        while(x <= 5){
            
                
            
        System.out.println("Introduce una letra");
        
        char letraintro = sc.next().charAt(0);
        for(int i = 0; i < letra.length; i++) {
            if(letra[i]==letraintro){
                //Sustituimos el guion con la letra que se encontro
                letrasconguiones[i]= letraintro;
                x=x-1;
               
            }    
        }
        
        if(Arrays.equals(letra, letrasconguiones)){
            System.out.println("Eres ganador");
            ganamos = true;  //Se sale del programa      
            x=10;
        }
        System.out.println(letrasconguiones);
       x=x+1;
            
        }
        if(x==6){
            System.out.println("Perdiste");
            System.out.println("-------");
            System.out.println("|     |");
            System.out.println("|     0");
            System.out.println("|    -|-"       + "        La palabra era " +palabra);  
            System.out.println("|     |");
            System.out.println("|    | |");
            System.out.println("|     ");
            System.out.println("|_________     ");
        }
    }

    @Override
    public void salidaConsola() {
        
    }

    @Override
    public void capturarEntradaJugador() {
        
    }
    
}
