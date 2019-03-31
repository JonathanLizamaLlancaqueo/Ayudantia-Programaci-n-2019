package ejercicio_3;

/**
 *
 * @author JonathanLizama
 */
public class Ejercicio_3 {

      public static void main(String[] args) {
            

      }

      public static boolean EsPalindromo(String palabra) {
            for (int i = 0; i < palabra.length() / 2; i++) {
                  if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                        return false;
                  }
            }
            return true;
      }

}
