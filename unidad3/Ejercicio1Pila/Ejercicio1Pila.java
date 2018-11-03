
package ejercicio1pila;

import java.util.*;
public class Ejercicio1Pila {

    public static void main(String[] args) {
        // TODO code application logic here
      Pila <String> pilaNumeros = new Pila<>();
        Scanner teclado = new Scanner (System.in);
        int a;
        System.out.println("Ingrese Una Cadena de Caracteres: ");
        String Cadena = teclado.nextLine();
        a=Cadena.length();
        
        char descomposicion;
        char letter []= Cadena.toCharArray();
        for (int i=0; i<letter.length;i++){
            descomposicion=Cadena.charAt(i);
            String c = Character.toString(descomposicion);
            pilaNumeros.push(c);
        }
        pilaNumeros.Imprimir();
        System.out.println("");
        
        
        
        
        
    }
    
}
