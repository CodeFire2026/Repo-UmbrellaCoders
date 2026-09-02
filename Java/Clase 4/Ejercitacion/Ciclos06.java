/*
 Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar
 la suma de todos los números introducidos.
*/
package Ciclos06;

import java.util.Scanner;

public class Ciclos06 {

    public static void main(String[] args) {

        int num;
        int suma = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Digite un numero: ");
            num = entrada.nextInt();
            suma += num;
        } while (num != 0);

        System.out.println("Fin del programa: Ha ingresado 0");
        System.out.println("Suma de los numeros introducidos: " + suma);

        entrada.close();
    }
}