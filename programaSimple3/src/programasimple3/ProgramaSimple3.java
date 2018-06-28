package programasimple3;

import java.util.Scanner;

public class ProgramaSimple3 {

    public static void main(String[] args) {
//Actividad: Calcula con: 
//Valor hora , Horas Trabajadas,
//Dias Trabajados, Semanas Trabajadas,
//Meses Trabajados

//Imprimir Sueldo Neto, Bruto,Anual, Valor hora y Cantidad de horas Trabajadas.
//20%de retenciones en el sueldo neto
        System.out.println("[..]Test-1");
        Scanner entrada = new Scanner(System.in);

        double valorHora;
        int horasTrabajadas;
        int diasTrabajados;
        int semanasTrabajadas;
        int mesesTrabajados;

        System.out.println("Ingrese Valor hora: ");
        valorHora = entrada.nextDouble();

        if (valorHora > 0) {
            System.out.println("El Valor hora es:" + valorHora);
        } else {
            System.out.println("ingrese Valor mayor a CERO ");
        }
        System.out.println("-----------------");

        System.out.println("Ingrese Horas Trabajadas por dia: ");
        horasTrabajadas = entrada.nextInt();
        if (horasTrabajadas > 0 && horasTrabajadas < 24) {

            System.out.println("Horas trabajadas por dia: " + horasTrabajadas);
        } else {
            System.out.println("Por favor Ingrese valor mayor a CERO y menor a 25");

        }

        System.out.println("-----------------");

        System.out.println("Ingrese Dias Trabajados Por Semana: ");
        diasTrabajados = entrada.nextInt();
        if (diasTrabajados <= 0 && diasTrabajados > 8) {
            System.out.println("Dias trabajados por semana: " + diasTrabajados);

        } else {
            System.out.println("Por Favor Ingrese Valor mayor a CERO y menor a OCHO"
            );

        }

        System.out.println("-----------------");

        System.out.println("Ingrese Semanas Trabajadas: ");
        semanasTrabajadas = entrada.nextInt();
        if (semanasTrabajadas >= 0 && semanasTrabajadas < 6) {
            System.out.println("Semanas trabajadas: " + semanasTrabajadas);

        } else {
            System.out.println("Ingrese valor mayor a CERO y menor a SEIS");
        }

        System.out.println("-----------------");

        System.out.println("Ingrese Meses Trabajados: ");
        mesesTrabajados = entrada.nextInt();
        if (mesesTrabajados >= 0 && mesesTrabajados < 13) {
            System.out.println("Meses trabajados: " + mesesTrabajados);
        } else {
            System.out.println("Ingrese valor mayor a CERO y menor a TRECE");
        }

        System.out.println("-----------------");

        System.out.println("Calculando sueldos [...]");

        double valorDia = valorHora * horasTrabajadas;
        double valorSemanal = valorDia * diasTrabajados;
        double valorMensual = valorSemanal * semanasTrabajadas;
        double netoRetencion = valorMensual / 20;
        double sueldoNeto = valorMensual - netoRetencion;
        double sueldoBruto = valorMensual;
        double sueldoBrutoAnual = valorMensual * mesesTrabajados;

        System.out.println("Resuldados:"
                + "Valor por dia :" + valorDia + "/"
                + "Valor Semanal :" + valorSemanal);

        System.out.println("-----------------");
        System.out.println("El sueldo bruto es: " + sueldoBruto);
        System.out.println("-----------------");
        System.out.println("El sueldo neto es: " + sueldoNeto);
        System.out.println("-----------------");
        System.out.println("El sueldo Anual es: " + sueldoBrutoAnual);
        System.out.println("-----------------");
        System.out.println("Calculando sueldos [OK]");

        System.out.println("[OK]Test-1");
    }

}
