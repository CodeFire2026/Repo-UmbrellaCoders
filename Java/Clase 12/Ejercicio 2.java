package ejerciciosarreglos;

import java.util.Scanner;

/*
Ejercicio2: Leer por teclado dos tablas de 10 numeros enteros y mezclarlos en una tercera
de la siguiente forma: el 1° de A, el 1° de B, el 2° de A, el 2° de B...
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        //Cargar el arreglo A
        System.out.println("Arreglo A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Ingrese un numero: ");
            A[i] = entrada.nextInt();
        }

        //Cargar el arreglo B
        System.out.println("\nArreglo B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("Ingrese un numero: ");
            B[i] = entrada.nextInt();
        }

        //Mezclar los arreglos A y B en C
        int j = 0;
        for (int i = 0; i < 10; i++) {
            C[j] = A[i];
            j++;
            C[j] = B[i];
            j++;
        }

        //Mostrar el arreglo C
        System.out.println("\nArreglo C:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(+C[i] + " ");
        }
    }
}