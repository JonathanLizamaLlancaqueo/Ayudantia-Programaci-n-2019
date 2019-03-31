package ejercicio_4;

/**
 *
 * @author JonathanLizama
 */
public class Ejercicio_4 {

      public static void main(String[] args) {
            
            

      }

     public static int MayorProductoAdyacente(int[] arreglo) {
            int tamaño = arreglo.length;
            int mayor = arreglo[0] * arreglo[1];
            for (int i = 0; i < tamaño - 1; i++) {
                  if (arreglo[i] * arreglo[i + 1] > mayor) {
                        mayor = arreglo[i] * arreglo[i + 1];
                  }
            }

            return mayor;

      }
     
     public static int MenorProductoAdyacente(int[] arreglo) {
            int tamaño = arreglo.length;
            int menor = arreglo[0] * arreglo[1];
            for (int i = 0; i < tamaño - 1; i++) {
                  if (arreglo[i] * arreglo[i + 1] < menor) {
                        menor = arreglo[i] * arreglo[i + 1];
                  }
            }

            return menor;

      }

}
