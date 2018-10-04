
package ejerciciopalindromo;

import java.util.*;
public class EjercicioPalindromo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        String frase;
        System.out.println("Ingrese una palabra: ");
        frase=teclado.nextLine();
      frase=frase.replaceAll(" ", "");
       palindromo ob = new palindromo();
       int x=0;
       int y=frase.length()-1;
       
     
        if ( ob.p(frase , x, y)==true){
            System.out.println("Es palindromo");
        }else {
            System.out.println("No es palindromo");
        }
        
        
        
        
        
        
        
        
    }
    
}
