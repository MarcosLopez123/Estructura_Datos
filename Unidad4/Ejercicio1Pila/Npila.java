
package ejercicio1pila;
/**
    *@param <M>
*/
public class Npila <M> {
    private M e;
    private Npila<M> s; //Apunta al siguiente nodo
    
    //Contructor
    public Npila(M e, Npila<M> s){
        this.e = e;
        this.s = s;
    }

    //Metodos
    public M getElemento() {
        return e;
    }

    public void setElemento(M e) {
        this.e = e;
    }

    public Npila<M> getSiguiente() {
        return s;
    }

    public void setSiguiente(Npila<M> s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return e+"\n";
    }
    
    
    
    
    
}
