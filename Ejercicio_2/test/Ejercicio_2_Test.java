
import ejercicio_2.Ejercicio_2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JonathanLizama
 */
public class Ejercicio_2_Test {
      
      public Ejercicio_2_Test() {
      }
      
      @Before
      public void setUp() {
      }
      
      @After
      public void tearDown() {
      }

      @Test
      public void testRestoDistintoCero(){
         int resultado = Ejercicio_2.PasarAñoASiglo(1905);
         int esperado = 20;
         
         assertEquals(esperado, resultado);
      }
      
      @Test
      public void testAñoUnDigito(){
         int resultado = Ejercicio_2.PasarAñoASiglo(9);
         int esperado = 1;
         
         assertEquals(esperado, resultado);
      }
      
      @Test
      public void testNumeroNegativo(){    
        System.out.print("no se pueden ingresar numeros negativos");
      }
}
