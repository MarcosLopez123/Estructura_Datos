
package ejerciciobinario;
import java.util.*;
public class EjercicioBinario {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        Integer numero;
        System.out.println("Ingrese un numero: ");
        numero = teclado.nextInt();
       TransformaBinario ob = new TransformaBinario();
       
        System.out.println("El numero "+numero+ " en binario es "+ob.binario(numero));
        
    }
    
}
