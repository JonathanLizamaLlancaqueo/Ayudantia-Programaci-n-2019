/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejercicio_3.Ejercicio_3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JonathanLizama
 */
public class Ejercicio_3_Test {

      public Ejercicio_3_Test() {
      }

      @Before
      public void setUp() {
      }

      @After
      public void tearDown() {
      }

      @Test(expected = NullPointerException.class)
      public void reconocerNull() throws Exception {
            Ejercicio_3.EsPalindromo(null);
      }

      @Test
      public void reconocerNumero() {
            assertEquals(false, Ejercicio_3.EsPalindromo("200"));

      }

      @Test
      public void UnCaracter() {
            assertEquals(true, Ejercicio_3.EsPalindromo("a"));
      }

      @Test
      public void DosCaracteresIguales() {
            assertEquals(true, Ejercicio_3.EsPalindromo("aa"));
      }

      @Test
      public void palindromo() {
            boolean resultado = Ejercicio_3.EsPalindromo("abba");
            boolean esperado = true;
            assertEquals(esperado, resultado);
      }

      @Test
      public void NOEsPalindromo() {
            boolean resultado = Ejercicio_3.EsPalindromo("abbasww");
            boolean esperado = false;
            assertEquals(esperado, resultado);
      }

      @Test
      public void ReconocerUnNoPalindromo() {
            assertEquals(false, Ejercicio_3.EsPalindromo("noPalindromo"));
      }

      @Test
      public void DosCaracteresDistintos() {
            assertEquals(false, Ejercicio_3.EsPalindromo("ab"));
      }
      
      @Test 
      public void palindromoGrande(){
           boolean resultado = Ejercicio_3.EsPalindromo("hlbeeykoqqqqokyeeblh");
           boolean esperado = true;
            assertEquals(esperado, resultado);
      }

}
