package Operadores;

import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
        /*Operadores Arismeticos */
        
        Scanner entrada = new Scanner(System.in);

        double numero1;
        double numero2;
        double suma, resta, division, multiplicacion, resto;

        System.out.println("Digite dos numero: ");
        numero1 = entrada.nextDouble();
        numero2 = entrada.nextDouble();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        division = numero1 / numero2;
        resto = numero1 % 2;
        multiplicacion = numero1 * numero2;

        System.out.println("La Suma De Los Dos Numero Es: " + suma);
        System.out.println("La Resta De Los Dos Numero Es: " + resta);
        System.out.println("La Multiplicacion De Los Dos Numero Es: " + multiplicacion);
        System.out.println("La Division De Los Dos Numero Es: " + division);
        System.out.println("El Resto De Los Dos Numero Es:" + resto);
    }

}
