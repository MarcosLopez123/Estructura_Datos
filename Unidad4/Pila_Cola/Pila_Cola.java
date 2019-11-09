
package pila_cola;
import java.util.*;

public class Pila_Cola {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in); 
        Pila<Integer> pilaNumeros= new Pila<>();
        System.out.print("Cuantos numeros desea ingresar: ");
        int num=teclado.nextInt();
        for (int i=0; i<num;i++){
            System.out.print("Ingrese un valor a la pila: ");
            int n = teclado.nextInt();
            pilaNumeros.push(n);
        }
        System.out.println("");
        System.out.println("Imprimiendo la pila");
        System.out.println(pilaNumeros);
        Cola c=new Cola();
        System.out.println("Imprimir cola: ");
         c.LlenarCola(pilaNumeros);
        System.out.println(pilaNumeros);
        
    }
    
}
