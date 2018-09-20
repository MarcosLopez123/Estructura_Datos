/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioc;

/**
 *
 * @author marco
 */
public class NumNaturales {
    int n;
    NumNaturales(int w){
    this.n=w;
}
    int Cero(){
        n=0;
    return n;
    }
    int Sucesor()
    {
        n++;
        return n;
    }
    int Antecesor(){
        n--;
        return n;
    }
   String Escero()
   {
       String r;
       if (n==0)
           r=" Es cero";
       else 
           r=" No es cero";
       return r;
   }
   String Igual(int c)
   {
       String r;
       if (n==c)
           r=" Es igual ";
       else
           r=" No es igual ";
       return r;
   }
   int Suma(int c){
       int r;
       r=n+c;
       return r;
   }
   String Menor(int c){
       String r;
       if (n<c){
           r=" Es menor ";
       }
       else 
           r=" Es mayor ";
       return r;
   }
   int Diferencia(int c){
       int r;
       r=n-c;
       return r;
   }
}
