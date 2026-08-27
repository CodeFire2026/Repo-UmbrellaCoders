package Ciclos04;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos04 {

    public static void main(String[] args) {

        // ===== Versión 1: usando Scanner =====
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("=== Versión con Scanner ===");
        do {
            System.out.print("Ingrese un número (negativo para salir): ");
            System.out.flush();
            numero = sc.nextInt();

            if (numero >= 0) {
                contador++;
            }

        } while (numero >= 0);

        System.out.println("Cantidad de números ingresados: " + contador);

        // ===== Versión 2: usando JOptionPane =====
        int numero2;
        int contador2 = 0;

        do {
            String texto = JOptionPane.showInputDialog("Ingrese un número (negativo para salir):");
            numero2 = Integer.parseInt(texto);

            if (numero2 >= 0) {
                contador2++;
            }

        } while (numero2 >= 0);

        JOptionPane.showMessageDialog(null, "Cantidad de números ingresados: " + contador2);

        sc.close();
    }
}