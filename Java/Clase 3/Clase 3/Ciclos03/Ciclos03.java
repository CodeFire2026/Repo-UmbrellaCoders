/*
 Ejercicio 3.1: Leer números hasta que se introduzca un cero
 Para cada uno indicar si es par o impar.
 Version con la clase JOptionPane (ventanas graficas).
 */
package Ciclos03;

import javax.swing.JOptionPane;

public class Ciclos03JOptionPane {

    public static void main(String[] args) {

        String texto;   // lo que el usuario escribe en la ventana (siempre llega como texto)
        int numero;     // ese mismo dato ya convertido a numero entero

        // showInputDialog muestra una ventana con un cuadro de texto
        // y devuelve un String, NO un int. Por eso hay que convertirlo.
        texto = JOptionPane.showInputDialog("Ingrese un numero (0 para terminar):");

        // Si el usuario aprieta Cancelar o la X, showInputDialog devuelve null.
        // Lo tratamos como si hubiera escrito 0, asi el programa no se rompe.
        if (texto == null) {
            texto = "0";
        }

        // Integer.parseInt convierte el texto "5" en el numero 5
        numero = Integer.parseInt(texto);

        while (numero != 0) {

            // El resto de la division por 2 nos dice si es par o impar
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es PAR");
            } else {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es IMPAR");
            }

            // Volvemos a pedir un numero para que el ciclo pueda avanzar
            texto = JOptionPane.showInputDialog("Ingrese un numero (0 para terminar):");

            if (texto == null) {
                texto = "0";
            }

            numero = Integer.parseInt(texto);
        }

        JOptionPane.showMessageDialog(null, "Se ingreso un 0. Fin del programa.");

        // Cierra la aplicacion grafica (si no, la ventana puede quedar en memoria)
        System.exit(0);
    }
}
