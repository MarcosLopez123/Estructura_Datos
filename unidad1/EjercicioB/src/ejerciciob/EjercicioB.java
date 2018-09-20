/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciob;

/**
 *
 * @author marco
 */

import java.util.Scanner;
import java.util.Random;
public class EjercicioB {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
       Random r = new Random(); //Numero ramdom.
       String[] palabras = {"naranja","sandia","melon","pera", "pepino", "vetabel", "brocoli", "tomate", "papaya"};
       int n_azar = r.nextInt(palabras.length); 
       
       //Declaracion del Objeto.
       Ahorcado pro = new Ahorcado(); 
       
       //Objetos.
       pro.Cadena(palabras, n_azar); //Convierte la cadena string a char.
       pro.OcultarCadena(); //Oculta la palabra.
       
       for(int i = 1; i <= 6; i++){
           pro.Juego(teclado, i);
           pro.Verificacion(i);
           System.out.println(pro.getCadenaJuego()); 
       }
    }
    
}
