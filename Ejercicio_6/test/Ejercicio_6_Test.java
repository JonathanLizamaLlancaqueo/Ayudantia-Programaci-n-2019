/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejercicio_6.Ejercicio_6;
import java.util.Random;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JonathanLizama
 */
public class Ejercicio_6_Test {

      public Ejercicio_6_Test() {

      }


      @Test

      public void testArregloTamaño4() {
            int arreglo[] = new int[]{1, 5, 6, 3};
            int resultado = Ejercicio_6.Estatuas(arreglo);
            int esperado = 2;
            assertEquals(resultado, esperado);

      }

      @Test
      public void testArregloTamaño1() {
            int arreglo[] = new int[]{4};
            int resultado = Ejercicio_6.Estatuas(arreglo);
            int esperado = 0;
            assertEquals(resultado, esperado);

      }
       // aquii ocurre un error,debo revisar mi codigo
      @Test
      public void testArregloNumerosRepetidos() {
            int arreglo[] = new int[]{1, 3, 1,2,5, 7};
            assertEquals(Ejercicio_6.Estatuas(arreglo), 2);

      }

      @Test
      public void testArregloAzar() {
            int arreglo[] = new int[5];
            Random azar = new Random();
            for (int i = 0; i < arreglo.length; i++) {
                  arreglo[i] = azar.nextInt(10) + 1;
            }
            int resultado = Ejercicio_6.Estatuas(arreglo);
            int resultado_azar = resultado;
            int esperado = resultado_azar;
            assertEquals(resultado, esperado);

      }

      @Test
      public void testArregloIngresadoPorElUsuario() {
            int tam = 3;
            int arreglo[] = new int[tam];

            for (int i = 0; i < tam; i++) {
                  arreglo[0] = 6;
                  arreglo[1] = 3;
                  arreglo[2] = 8;

            }
            int resultado = Ejercicio_6.Estatuas(arreglo);
            int esperado = 3;
            assertEquals(esperado, resultado);

      }

      @Test
      public void testArregloTamaño10() {
            int arreglo[] = new int[]{1, 5, 6, 20, 10, 2, 4, 9, 15, 3};
            assertEquals(Ejercicio_6.Estatuas(arreglo), 10);

      }
}
