
package example;
import java.util.ArrayList;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
         ArrayList <Integer> CA = new ArrayList();
        CA.add(21);
        CA.add(5);
        CA.add(45);
        CA.add(3);
        CA.add(63);
        CA.add(12);
        CA.add(6);
        ArrayList <Integer> CB = new ArrayList();
        CB.add(2);
        CB.add(9);
        CB.add(5);
        CB.add(54);
        CB.add(158);
        CB.add(0);
        System.out.println("EL arreglo A: "+CA);
        System.out.println("El arreglo B: "+CB);
        int opcion;
        do {
          Operation ob = new Operation();
        System.out.println("1.- Conjunto Vacio");
        System.out.println("2.- Es Vacio");
        System.out.println("3.- Agregar");
        System.out.println("4.- Union");
        System.out.println("5.- Buscar elemento");
        System.out.println("6.- Interseccion");
        System.out.println("7.- Diferencia");
        System.out.println("8.- Eliminar elemento");
        System.out.println("9.- Salir"); 
        System.out.print("Eliga una Opcion :");
        opcion = teclado.nextInt();
        if (opcion==1){
            ob.ConjuntoVacio(CA);
        }else if(opcion ==2){ 
            ob.EsVacio(CA);
        }else if(opcion==3){
           ob.Agregar(CA);
        }else if(opcion ==4){
            ob.Union(CA,CB);
        }else if(opcion==5){
            int z;
            System.out.println("Ingrese el numero a buscar: ");
            z=teclado.nextInt();
            ob.Buscar(CA,z);
        }else if(opcion==6){
             ob.Interseccion(CA, CB);
        }else if(opcion==7){
            ob.Diferencia(CA, CB);
        }else if(opcion==8){
             ob.Eliminar(CA);
        }else if(opcion==9){
            System.out.println("El programa termino con exito"); 
        }
       
        } while(opcion !=9);
        
    }// llaves del main
    
}//llaves del public class
