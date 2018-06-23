package programasimple1;

public class ProgramaSimple1 {

    public static void main(String[] args) {
//Problema:
//*Calculo de la edad de una persona.
// 
//-Entradas:
//   -fecha actual
//   -fecha de nacimiento
//          
// -Salidas
//   -Edad
//
//-Proceso
//   -Restar la fecha de nacimiento de la fecha actual
//  ------------------------------------
        System.out.println("[..]Actividad Edad");
        System.out.println("-----------------------");

        String NombresYanio[] = {
            "Eduardo-1956",
            "Alfonso-1990",
            "Beatriz-2000",
            "Mauricio-1973"
        };

        int AnioDeNacimiento[] = {1956, 1990, 2000, 1973};

        int AnioActual = 2018;

        int edad = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println(NombresYanio[i]);
            System.out.println("su edad es: " + (AnioActual - AnioDeNacimiento[i]));
            System.out.println("-----------------------");

        }

        System.out.println("[Ok]Edad");

    }

}
