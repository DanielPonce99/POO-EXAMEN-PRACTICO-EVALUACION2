
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
class TicTacToe extends Juego implements capturaGato{

    @Override
    public void jugar() {
         Scanner sc = new Scanner(System.in);
                 System.out.println("Gato");
                
        String x1="",x2="",x3="",x4="",x5="",x6="",x7="",x8="",x9="";
        for (int i = 0; i <=9; i++) {
            
        
        System.out.println("Del 1 al 9 que posición escoges");
        int op1 = sc.nextInt();
        if(op1 == 1){
            System.out.println("X u O");
        x1=sc.next();
        }else if(op1 == 2){
        System.out.println("X u O");
        x2=sc.next();
        }else if(op1 == 3){
        System.out.println("X u O");
        x3=sc.next();
        }else if(op1 == 4){
        System.out.println("X u O");
        x4=sc.next();
        }else if(op1 == 5){
        System.out.println("X u O");
        x5=sc.next();
        }else if(op1 == 6){
        System.out.println("X u O");
        x6=sc.next();
        }else if(op1 == 7){
        System.out.println("X u O");
        x7=sc.next();
        }else if(op1 == 8){
        System.out.println("X u O");
        x8=sc.next();
        }else if(op1 == 9){
        System.out.println("X u O");
        x9=sc.next();
        }else{
            System.out.println("Deja de jugar ");
        }
       
        
        System.out.println("");
        System.out.println(x1+"|"+x2+"|"+x3);
        System.out.println("_____");
        System.out.println(x4+"|"+x5+"|"+x6);
        System.out.println("_____");
        System.out.println(x7+"|"+x8+"|"+x9);
        if(x1.equals("X")&&x2.equals("X")&&x3.equals("X")){
        i=10;
            System.out.println("Ganaste ");
        }if(x4.equals("O")&&x5.equals("O")&&x6.equals("O")){
        i=10;
            System.out.println("Ganaste ");
        }
        if(x7.equals("O")&&x8.equals("O")&&x9.equals("O")){
        i=10;
            System.out.println("Ganaste ");
        }
        if(x1.equals("O")&&x2.equals("O")&&x3.equals("O")){
        i=10;
            System.out.println("Ganaste ");
        }if(x4.equals("O")&&x5.equals("O")&&x6.equals("O")){
        i=10;
            System.out.println("Ganaste ");
        }
        if(x7.equals("O")&&x8.equals("O")&&x9.equals("O")){
        i=10;
            System.out.println("Ganaste ");
        }
        }
    }

    @Override
    public void salidaConsola() {
        
    }

    @Override
    public void capturarEntradaJugador() {
        
    }
    
}
