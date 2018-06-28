package actividad1;

public class Actividad1 {

    public static void main(String[] args) {
        /*Actividad: Imprime en pantalla los numeros impares del 1 al 100 */

        System.out.println("[..]");

        for (int i = 0; i < 100; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);

            }

        }
        System.out.println("[OK]");

    }
}
