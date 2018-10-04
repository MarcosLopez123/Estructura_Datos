
package ejerciciopalindromo;

public class palindromo {
    
    palindromo(){
        
    }
    
    public static boolean p (String nombre, int i, int y){
        if (i!=nombre.length()/2){
           if(nombre.charAt(i)== nombre.charAt(y)) 
               return p(nombre,++i,--y);
           else
               return false;
        }return true;
        
    } 
    
    
    
}
