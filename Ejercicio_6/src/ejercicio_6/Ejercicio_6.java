package ejercicio_6;

import java.util.Arrays;

/**
 *
 * @author JonathanLizama
 */
public class Ejercicio_6 {

      
      public static void main(String[] args) {
          
        
      }
      
      public static int Estatuas(int arreglo[]){
             Arrays.sort(arreglo);
             int totalEstatuas = arreglo[arreglo.length-1] - arreglo[0];
             return  totalEstatuas - arreglo.length + 1;    
      }
      
}
