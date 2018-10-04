
package ejerciciomonedas;

public class Monedas {
    Monedas(){
        
    }
    
    public int[] cambio(int resta[], int x){
         
      if (x==0){
          return resta;
      }else if(x>=200){
          resta[0]++;
          return cambio(resta, x-200);
      }else if(x>=100){
          resta[1]++;
          return cambio(resta, x-100);
      }else if(x>=50){
          resta[2]++;
          return cambio(resta, x-50);
      }else if(x>=20){
          resta[3]++;
          return cambio(resta, x-20);
      }else if(x>=10){
          resta[4]++;
          return cambio(resta, x-10);
      }else if(x>=5){
          resta[5]++;
          return cambio(resta, x-5);
      }else if(x>=2){
          resta[6]++;
          return cambio(resta, x-2);
      }
      else {
          resta[7]++;
          return cambio(resta, x-1);
      }
      
     }
    
   
}
