/*
Ejercicio 12: Pedir un número y calcular su factorial
Hacerlo con las dos clases, Scanner y JOptionPane

Se agrega un menú inicial para elegir con qué método
ingresar el número: Scanner o JOptionPane.
*/

package Ciclos12;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos12 {

    public static void main(String[] args) {

        // Menú de selección de método (usamos JOptionPane para el menú en sí)
        String[] opciones = {"Scanner", "JOptionPane"};
        int opcion = JOptionPane.showOptionDialog(
                null,
                "¿Con qué método querés ingresar el número?",
                "Ejercicio 12 - Ciclos",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        // Si el usuario cierra el menú sin elegir, se termina el programa
        if (opcion == JOptionPane.CLOSED_OPTION) {
            System.out.println("No se seleccionó ninguna opción. Fin del programa.");
            return;
        }

        int n;
        long factorial = 1;

        if (opcion == 0) {
            // ----- Método con Scanner -----
            Scanner teclado = new Scanner(System.in);

            System.out.print("Ingrese un número: ");
            n = teclado.nextInt();

            teclado.close();

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + n + " es: " + factorial);

        } else {
            // ----- Método con JOptionPane -----
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número:"));

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + factorial);
        }
    }
}