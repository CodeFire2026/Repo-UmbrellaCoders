/*
Ejercicio 10: Pedir 10 números y escribir la suma total
Hacerlo con la clase Scanner y JOptionPane
*/

package ciclos10;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos10 {

    public static void main(String[] args) {

        // Menú de selección de método (usamos JOptionPane para el menú en sí)
        String[] opciones = {"Scanner", "JOptionPane"};
        int opcion = JOptionPane.showOptionDialog(
                null,
                "¿Con qué método querés ingresar los 10 números?",
                "Ejercicio 10 - Ciclos",
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

        double suma = 0;
        double numero;

        if (opcion == 0) {
            // ----- Método con Scanner -----
            Scanner teclado = new Scanner(System.in);

            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                numero = teclado.nextDouble();
                suma += numero;
            }

            teclado.close();

            System.out.println("La suma total es: " + suma);

        } else {
            // ----- Método con JOptionPane -----
            for (int i = 1; i <= 10; i++) {
                numero = Double.parseDouble(
                        JOptionPane.showInputDialog(null, "Ingrese el número " + i + ":"));
                suma += numero;
            }

            JOptionPane.showMessageDialog(null, "La suma total es: " + suma);
        }
    }
}