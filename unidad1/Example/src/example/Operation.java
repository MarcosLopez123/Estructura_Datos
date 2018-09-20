
package example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public class Operation {
    Operation(){  
    }//Llave del constructor
    public void ConjuntoVacio(ArrayList <Integer> CA){//Inicia metodo
         CA.clear();
            System.out.println("El conjunto A = "+CA);
    }//termina metodo
    public void EsVacio(ArrayList <Integer> CA){
        boolean Vacio = CA.isEmpty();
      if (Vacio == true) {
         System.out.println("Este Arreglo no contiene elementos");
      } else {
         System.out.println("Este Arreglo si contiene elementos");
      }
    }
   public  void Union(ArrayList <Integer> CA, ArrayList <Integer> CB){// empieza el metodo Union
       List <Integer> CN = new ArrayList <Integer>();
         CN.addAll(CA);
         CN.addAll(CB);
         HashSet<Integer> hashSet = new HashSet<Integer>(CN);
		CN.clear();
		CN.addAll(hashSet);
         
         System.out.println("La union es: "+ CN);
        
   }//Fin del metodo Union
   
    public  void Agregar(ArrayList <Integer> CA){//Inicia Metodo Agregar
        Scanner teclado = new Scanner (System.in);
          System.out.println("Desea Agregar un nuevo numero S/N");
        char res=teclado.next().charAt(0);
        //Inicia if
        if (res=='S' || res=='s'){
            int x;
            System.out.println("Ingrese el nuevo valor: ");
            x=teclado.nextInt();
            CA.add(6,x);//Señalamos la posicion y el nuevo elemento que estara en el arreglo
            System.out.println("EL arreglo A con el nuevo elemento es : "+CA);
        }else if(res=='N' || res=='n'){
            System.out.println("Eiga otra opcion ");
            
        }//Termina if     
    }//Termina el metodo agregar
    
   public void Buscar(ArrayList <Integer> CA, int z){
       if(CA.contains(z))
           System.out.println("El numero ingresado "+z+ " si se encuentra en el conjunto");
       else 
           System.out.println("El numero ingresado "+z+ " no se encuentra en el conjunto");
   } 
    
   public  void Interseccion(ArrayList <Integer> CA, ArrayList <Integer>CB){
         ArrayList <Integer> Conjc= new ArrayList ();
         System.out.println("El conjunto A es: "+CA);
         System.out.println("El conjunto B es: "+CB);
    for(int i=0; i<CA.size(); i++)
    {
        if (CB.contains(CA.get(i)))
            {
                Conjc.add(CA.get(i));
            }
                
    }
       Collections.sort(Conjc);
       System.out.println("La intersección de AnB es: "+Conjc);
 }   
   public  void Eliminar(ArrayList <Integer>CA){
    Scanner teclado= new Scanner (System.in);
        System.out.println("¿Desea eliminar algun numero del arreglo? S/N");
        char respuesta=teclado.next().charAt(0);
        
        if (respuesta=='S' || respuesta=='s'){
            System.out.println("Los valores que tiene actualmente el Conjunto son: ");
            System.out.println(CA);
         int num, cont=0;
         System.out.println("¿Que valor desea eliminar?");
         num=teclado.nextInt();
         for (int i=0; i<CA.size();i++){
        
           if (num==CA.get(i)){
              CA.remove(i); 
           }else{
           cont++;
           }
        }
           if(cont>0){
               System.out.println("El numero que usted ha ingresado no se encuentra en el conjunto");
           }
         System.out.println("El nuevo Conjunto es: "+ CA);
         //cont=0;
         
   }else if (respuesta=='N' || respuesta=='n'){
        System.out.println("¡...El programa finaliza..!");
   }
        
   }
   public  void Diferencia(ArrayList <Integer> CA, ArrayList <Integer>CB){
         ArrayList <Integer> Conjc= new ArrayList ();
         System.out.println("El conjunto A es: "+CA);
         System.out.println("El conjunto B es: "+CB);
    for(int i=0; i<CA.size(); i++)
    {
            if (!CB.contains(CA.get(i)))
            {
                Conjc.add(CA.get(i));
            }	 	
                
    }
       System.out.println("La Diferencia de A-B es: "+Conjc);
 } 
    
    
    
    
    
}// Llave del class principal
