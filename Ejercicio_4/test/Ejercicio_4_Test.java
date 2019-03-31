
import ejercicio_4.Ejercicio_4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JonathanLizama
 */
public class Ejercicio_4_Test {
      
      public Ejercicio_4_Test() {
      }

     @Test
     public void testNumerosPositivos(){
           int arreglo[]= new int[]{4,5,3,6,4};
           int resultado = Ejercicio_4.MayorProductoAdyacente(arreglo);
           int esperado = 24;
           assertEquals(esperado,resultado);
     }
     
     @Test
     public void testNumerosNegativo(){
           int arreglo[]= new int[]{-2,-5,-4,-6,-4};
           int resultado = Ejercicio_4.MayorProductoAdyacente(arreglo);
           int esperado = 24;
           assertEquals(esperado,resultado);
     }
     @Test
     public void testNumerosPositivosAndNegativos(){
           int arreglo[]= new int[]{-2,5,-4,3,-4};
           int resultado = Ejercicio_4.MayorProductoAdyacente(arreglo);
           int esperado = -10;
           assertEquals(esperado,resultado);
     }
     
     
     @Test
     public void testNumerosPositivosAndNegativosMENOR(){
           int arreglo[]= new int[]{-2,5,-4,3,-4};
           int resultado = Ejercicio_4.MenorProductoAdyacente(arreglo);
           int esperado = -20;
           assertEquals(esperado,resultado);
     }
}
