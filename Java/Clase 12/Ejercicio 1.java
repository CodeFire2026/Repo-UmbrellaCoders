package ejerciciosarreglos;

import java.util.Scanner;

/*
Ejercicio 1: Leer 10 numeros enteros, guardarlos en un arreglo y mostrarlos segun el 
siguiente orden: el primero, el ultimo, el segundo, el penultimo, el tercero...
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Arreglo para los numeros
        int[] numeros = new int[10]; 
        
        // Ciclo para ingresar los numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        // Mostrar el arreglo en el orden solicitado
        for (int i = 0; i < numeros.length / 2; i++) {
            System.out.print(numeros[i] + " ");
            System.out.print(numeros[numeros.length - 1 - i] + " ");
        }
    }
}