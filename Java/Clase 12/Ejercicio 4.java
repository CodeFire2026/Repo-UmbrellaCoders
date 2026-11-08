package ejerciciosarreglos;

import java.util.Scanner;

/*
Ejercicio 4: Leer por teclado una tabla de 10 numeros y una posicion (entre 0 - 9)
Eliminar el elemento seleccionado segun la posicion sin dejar huecos.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] tabla = new int[10];
        
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Digite un numero: ");
            tabla[i] = entrada.nextInt();
        }
        System.out.println("Pos - Elemento");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("  "+i+".    "+tabla[i]);
        }
        
        System.out.println("Digite una posicion (entre 0 - 9) para eliminar un elemento: ");
        int eliminado = entrada.nextInt();
        
        if (eliminado >= 0 && eliminado <= 9) {
            for (int i = eliminado; i < tabla.length - 1; i++) {
                tabla[i] = tabla[i + 1];
        }
            System.out.println("Pos - Elemento");
            for (int i = 0; i < tabla.length; i++) {
                System.out.println("  "+i+".    "+tabla[i]);
            }
        } else {
            System.out.println("La posición debe estar entre 0 y 9.");
        }
        
    }
}