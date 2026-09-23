/*
Ejercicio 11: Diseñar un programa que muestre el producto
de los 10 primeros números impares
Hacerlo con JOptionPane

Se agrega un menú inicial para elegir con qué método
mostrar el resultado: Scanner o JOptionPane.
*/

package Ciclos11;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos11 {

    public static void main(String[] args) {

        // Menú de selección de método (usamos JOptionPane para el menú en sí)
        String[] opciones = {"Scanner", "JOptionPane"};
        int opcion = JOptionPane.showOptionDialog(
                null,
                "¿Con qué método querés ejecutar el programa?",
                "Ejercicio 11 - Ciclos",
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

        long producto = 1;
        int numero = 1;

        // Calculamos el producto de los 10 primeros números impares
        for (int i = 1; i <= 10; i++) {
            producto *= numero;
            numero += 2;
        }

        if (opcion == 0) {
            // ----- Método con Scanner -----
            // (No se necesita ingresar datos, solo mostramos el resultado
            //  por consola, pero abrimos el Scanner por si se quisiera
            //  esperar una tecla o ampliar el ejercicio más adelante)
            Scanner teclado = new Scanner(System.in);

            System.out.println("El producto de los 10 primeros números impares es: " + producto);

            teclado.close();

        } else {
            // ----- Método con JOptionPane -----
            JOptionPane.showMessageDialog(null,
                    "El producto de los 10 primeros números impares es: " + producto);
        }
    }
}