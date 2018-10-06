/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
public class Datos {
    String [] listanom;
    Datos(ArrayList <String> nombres){
    this.listanom=new String [nombres.size()];
    listanom=nombres. toArray(listanom);
    }
    /*
   public void Ordenar(ArrayList <String> nom){
       // String []nombres= nom.toArray();
        Collections.sort(nom);//metodo que oredena los nombres del arraylist
        String[] nombres = new String[nom.size()];//creacion de un arreglo string con el tamaño del arraylist
        nombres = nom.toArray(nombres);//Pasamos la lista en el arreglo 
        for (String n: nombres){//for ech para mostrar en pantalla los nombres ordenados
            System.out.println(n);//Imprimimos la lista en forma vertical
        }
    }
    public void Buscar(ArrayList <String> nom, String n)
    {
        if(nom.contains(n))//Con el métdo contains buscamos en la lista si el elemento se encuentra en ella
            System.out.println("El nombre "+n+ " si se encuentra en la lista");
        else 
            System.out.println("El nombre "+n+ " no se encuentra en la lista");
    }*/
    /*public String [] OrdenarRecursivo(String [] nombres, int i){
        String aux=null;
        if(i==nombres.length-1)
            return nombres;
        else if(i>0 && nombres[i-1].compareToIgnoreCase(nombres[i])>0){
            aux=nombres[i];
            nombres[i]=nombres[i-1];//aux
            nombres[i-1]=aux;
            return OrdenarRecursivo(nombres, i-1);
        }
        else 
            return OrdenarRecursivo(nombres, i);
    }*/
  
    public boolean BuscarRecursivo(String [] nombres, String buscar, int i){
    if(i==nombres.length)//si i es igual al tamaño del arreglo significa que el nombre no se encuentra en la lista de datos
        return false;//retorna falso porque no encuentra el nombre
    if(nombres[i].equals(buscar)){//comprueba si el nombre ingresado se ecuentra en alguna posicion del arreglo
        return true;//retorna true
    }
    else
        return BuscarRecursivo(nombres, buscar, i+1);//llama al metodo para ir buscando el nombre en el arreglo
    }
    
    public String Comprobar(String buscar, int i){
    boolean respuesta=BuscarRecursivo(listanom, buscar, i);
    if (respuesta==true){
        return "El nombre: "+buscar+" si se encuentra en la lita";
    }
    else 
        return "El nombre: "+buscar+" no se encuentra en la lita";
    
    }
   //Metodo  para ordenar los nombres del array
     public void ordenare (String [] nombres, int j){
        if(j<nombres.length){
                ordenar(nombres, j, 0); // llamamos al segundo metodo recursivo
                ordenare(nombres, j+1);
        
        }     
}
  // segundo metodo recursivo
    public void ordenar(String[] nombres, int j, int x){
            if (x < nombres.length && j!= x){
                if(nombres[j].compareToIgnoreCase(nombres[x])<0){
                    String con = nombres[j];
                    nombres[j]=nombres[x];
                    nombres[x]=con;  
                } 
                ordenar(nombres, j,x+1); // llamamos al metodo para retornar
            }//2
                
          }
          
}
