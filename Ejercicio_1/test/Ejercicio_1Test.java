/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejercicio_1.Ejercicio_1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JonathanLizama
 */
public class Ejercicio_1Test {
      
      public Ejercicio_1Test() {
      }
      
      @Before
      public void setUp() {
      }
      
      @After
      public void tearDown() {
      }

      @Test
      public void testPositivos(){
            int resultado = Ejercicio_1.add(1, 2);
            int esperado  = 3;
            assertEquals(esperado,resultado);
      }
      
      @Test
      public void testCeroAndMil(){
            int resultado = Ejercicio_1.add(0, 1000);
            int esperado  = 1000;
            assertEquals(esperado,resultado);
      }
      
      @Test
      public void testNumerosMixtos(){
            int resultado = Ejercicio_1.add(-2, 39);
            int esperado  = 37;
            assertEquals(esperado,resultado);
      }
     
      @Test
      public void testNumerosNegativos(){
            int resultado = Ejercicio_1.add(-2, -4);
            int esperado  = -6;
            assertEquals(esperado,resultado);
      }
}
