package ejercicio_2;

/**
 *
 * @author JonathanLizama
 */
public class Ejercicio_2 {

      public static void main(String[] args) {

            System.out.println(PasarAñoASiglo(200));

      }

      public static int PasarAñoASiglo(int año) {
            int transformada;
            int SigloAño = año / 100;
            if (año % 100 == 0) {
                  transformada = SigloAño;
            } else {
                  transformada = SigloAño + 1;
            }
            return transformada;
      }

}
