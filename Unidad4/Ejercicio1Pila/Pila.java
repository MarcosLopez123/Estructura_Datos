
package ejercicio1pila;

/**
 
 * @param <M> 
 */

public class Pila <M> {
   //Atributos
    private Npila<M> t; //Ultimo nodo que se ha incluido
    private int ta;
    
    //Constructores
    public Pila(){
        t = null; //No hay elementos
        this.ta = 0;
    }
    
    public M push(M e){
        
        Npila<M> aux = new Npila<>(e, t);
        t = aux;
        this.ta++;
        return aux.getElemento();
    }
     public void Imprimir(){
    Npila aux=t;
    while(aux!=null){
        System.out.print(aux.getElemento());
        aux=aux.getSiguiente();
    
    }
    }
    
    
    
    
    
    
    
    
    
    
}

