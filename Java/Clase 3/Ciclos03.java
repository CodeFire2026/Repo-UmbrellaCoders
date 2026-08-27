/*
 Ejercicio 3.1: Leer números hasta que se introduzca un cero
 Para cada uno indicar si es par o impar.
 Primero lo haremos con la clase Scanner
 Luego con la clase JOptionPane
 */
package Ciclos03;

import java.util.Scanner;

public class Ciclos03 {

    public static void main(String[] args) {

        // Scanner sirve para leer lo que el usuario escribe por teclado (consola)
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese numeros. Con el 0 termina el programa.");

        // Primera lectura ANTES del while.
        // Es necesaria porque el while necesita un valor para poder evaluar la condicion.
        System.out.print("Ingrese un numero: ");
        numero = teclado.nextInt();

        // El ciclo se repite mientras el numero sea distinto de 0.
        // Si el usuario escribe 0 la condicion da falso y el ciclo corta.
        while (numero != 0) {

            // El operador % (modulo) devuelve el resto de la division.
            // Si al dividir por 2 el resto es 0, el numero es par.
            if (numero % 2 == 0) {
                System.out.println("El numero " + numero + " es PAR");
            } else {
                System.out.println("El numero " + numero + " es IMPAR");
            }

            // Ultima linea del ciclo: se vuelve a pedir un numero.
            // Sin esta linea el ciclo seria infinito, porque numero nunca cambiaria.
            System.out.print("Ingrese un numero: ");
            numero = teclado.nextInt();
        }

        System.out.println("Se ingreso un 0. Fin del programa.");

        // Cerramos el Scanner para liberar el recurso
        teclado.close();
    }
}
