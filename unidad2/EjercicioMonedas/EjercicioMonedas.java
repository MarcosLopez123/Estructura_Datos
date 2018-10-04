
package ejerciciomonedas;

import java.util.*;
public class EjercicioMonedas {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int cantidadtotal, dineroentregado, cam;
        int resta [] = new int [8];
        System.out.println("Cuanto es el total de la compra: ");
        cantidadtotal=teclado.nextInt();
        System.out.println("Cuanto es el dinero entregado : ");
        dineroentregado=teclado.nextInt();
        cam  = dineroentregado - cantidadtotal;
        System.out.println("Su cambio es "+cam);
        Monedas em = new Monedas ();
        resta=em.cambio(resta, cam);
       
      for (int i=0; i<8;i++){
          if(i==0){
              System.out.println("Billetes de 200 " +resta[0]);
          }else if(i==1){
              System.out.println("Billetes de 100 " + resta[1]);
          }else if(i==2){
              System.out.println("Billetes de 50 " + resta[2]);
          }else if(i==3){
              System.out.println("Billetes de 20 " + resta[3]);
          }else if(i==4){
              System.out.println("Monedas de 10 " + resta[4]);
          }else if(i==5){
              System.out.println("Monedas de 5 " +resta[5]);
          }else if(i==6){
              System.out.println("Monedas de 2 " +resta[6]);
          }else if(i==7){
              System.out.println("Monedas de 1 " + resta[7]);
          }
    
          
      }
      
       
        
    }
    
}
