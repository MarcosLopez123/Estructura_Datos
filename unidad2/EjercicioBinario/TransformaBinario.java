
package ejerciciobinario;


public class TransformaBinario {
    TransformaBinario(){
    }
    public long binario (Integer n){
        if (n<2) return n;
        else return  n%2+binario(n/2)*10;
    }
    
    
    
    
    
    
    
}
