
package pila_cola;

/**
 *
 *
 * @param <T>
 */
public class Cola <T> {
    private NodoCola<T> primero;
    private NodoCola<T> ultimo;
    private int tamanio;

    public Cola() {
        primero = null;
        ultimo = null;
        tamanio = 0;

    }

    
    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return tamanio;
    }

    
    public T primero() {
        if (isEmpty()) {
            return null;
        }

        return primero.getElemento();
    }

    
   
    public T enqueue(T elemento) {

        NodoCola<T> aux = new NodoCola(elemento, null);

        if (isEmpty()) {
            primero = aux;
            ultimo = aux;
        } else {
            if (size() == 1) {
                primero.setSiguiente(aux);
            } else {
                ultimo.setSiguiente(aux);
            }
            ultimo = aux;
        }

        tamanio++;
        return aux.getElemento();

    }

    
    public String toString() {

        if (isEmpty()) {
            return "La cola esta vacia";
        } else {

            String cadena = "";

            NodoCola<T> aux = primero;
            while (aux != null) {
                cadena += aux;
                aux = aux.getSiguiente();
            }

            return cadena;

        }

    }
    public void LlenarCola (Pila <Integer> pilaN){
       
        Cola<Integer> colaNumeros=new Cola<>();
        while(!pilaN.isEmpty()==true){
        colaNumeros.enqueue(pilaN.pop());
        }
        
        System.out.println(colaNumeros);
       
        
    }

    
}
