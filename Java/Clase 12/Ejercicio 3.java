package ejerciciosarreglos;

import java.util.Scanner;

/*
Ejercicio 3: Leer 5 numeros que se introduzcan ordenados de forma ascendente.
Guardarlos en una tabla de tamaño 10.
Leer un numero N e insertarlo en su lugar correspondiente respecto al orden.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] tabla = new int[10];
        
        System.out.println("Cargue la tabla de forma ascendente");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero: ");
            tabla[i] = entrada.nextInt();
            
            if (i > 0 && tabla[i] <= tabla[i -1]){
                System.out.println("Debe ingresar los numero en orden ascendente");
                i--;
            }
         }
        
        System.out.println("Ingrese un nuevo numero: ");
        int N = entrada.nextInt();
        // Desplazar los números mayores que N
        int i = 4;

        while (i >= 0 && tabla[i] > N) {
            tabla[i + 1] = tabla[i];
            i--;
        }
        // Insertar N en su posición
        tabla[i + 1] = N;

        // Mostrar la tabla resultante
        System.out.println("\nTabla:");
        for (int j = 0; j < 6; j++) {
            System.out.print(tabla[j] + " ");
        }
    }
}