
import ejercicio_5.Ejercicio_5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JonathanLizama
 */
public class Ejercicio_5_Test {
      
      public Ejercicio_5_Test() {
      }
      
    
      
      @Test
      public void testAreaPositiva(){
            int resultado= Ejercicio_5.area(3);
            int esperado = 13;
            assertEquals(esperado,resultado);
      }
      
       @Test
      public void testAreaPositiva1(){
            int resultado= Ejercicio_5.area(4);
            int esperado = 25;
            assertEquals(esperado,resultado);
      }

      @Test
      public void testAreaNegativa(){
            int resultado= Ejercicio_5.area(-3);
            int esperado = 25;
            assertEquals(esperado,resultado);
      }
}
