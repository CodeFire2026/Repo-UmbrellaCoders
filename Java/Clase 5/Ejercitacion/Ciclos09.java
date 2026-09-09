/*
Ejercicio 9: Pedir el dia, mes y año de una fecha e
indicar si la fecha es correcta. Suponiendo que
todos los meses son de 30 dÃ­as.

Este programa permite elegir entre Scanner o JOptionPane
para ingresar la fecha, mediante un menÃº inicial.
*/

package Ciclos09;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos09 {

    public static void main(String[] args) {

        // Menu de seleccionn de metodo (usamos JOptionPane para el menu en s­)
        String[] opciones = {"Scanner", "JOptionPane"};
        int opcion = JOptionPane.showOptionDialog(
                null,
                "Â¿Con que metodo queres ingresar la fecha?",
                "Ejercicio 9 - Ciclos",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        // Si el usuario cierra el menu sin elegir, se termina el programa
        if (opcion == JOptionPane.CLOSED_OPTION) {
            System.out.println("No se selecciono ninguna opcion. Fin del programa.");
            return;
        }

        int dia, mes, año;

        if (opcion == 0) {
            // ----- Metodo con Scanner -----
            Scanner teclado = new Scanner(System.in);

            System.out.print("Ingrese el di­a: ");
            dia = teclado.nextInt();

            System.out.print("Ingrese el mes: ");
            mes = teclado.nextInt();

            System.out.print("Ingrese el año: ");
            año = teclado.nextInt();

            teclado.close();

            if (esFechaValida(dia, mes, año)) {
                System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
            } else {
                System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es incorrecta.");
            }

        } else {
            // ----- Metodo con JOptionPane -----
            dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el di­a:"));
            mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes:"));
            año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año:"));

            if (esFechaValida(dia, mes, año)) {
                JOptionPane.showMessageDialog(null,
                        "La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "La fecha " + dia + "/" + mes + "/" + año + " es incorrecta.");
            }
        }
    }

    // Valida la fecha suponiendo que todos los meses tienen 30 di­as
    public static boolean esFechaValida(int dia, int mes, int año) {
        if (año <= 0) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > 30) {
            return false;
        }
        return true;
    }
}
