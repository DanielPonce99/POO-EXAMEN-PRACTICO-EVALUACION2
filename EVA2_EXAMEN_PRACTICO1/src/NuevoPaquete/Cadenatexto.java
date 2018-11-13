/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevoPaquete;

/**
 *
 * @author user1
 */
public class Cadenatexto {
       private int val;
    private String te;
    
     
    public Cadenatexto() {
        this.val = 10;
        this.te = "H";
    }
    
    public Cadenatexto(int val, String te) {
        this.val = val;
        this.te = te;
}

     
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
   
    public String getTe() {
        return te;
    }

    public void setTe(String te) {
        this.te = te;
    }

   
        public void imprimeCadena()
{
    

    System.out.println("Las veces que se imprimira son " + this.getVal() );
System.out.println(" Forma en imprimirlo " + this.getTe());

}
}