package C5_Ejercitacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Ejercicio 1: Pedir un numero y mostrar todos los numeoros del 1
        // a ese numero ingresado
        int opcion;
        Scanner entrada = new Scanner(System.in);
        do {
            // Menu de opciones para las clases
            System.out.println("\n" + "Elija el modo de ejecucion del programa: ");
            System.out.println("1. Ejecutar en consola con Scanner");
            System.out.println("2. Ejecutar en ventanas con JOptionPane");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("=== CLASE SCANNER ===");
                    // Clase Scanner
                    System.out.println("Digite un numero mayor a cero: ");
                    int num;
                    num = entrada.nextInt();
                    // Ciclo para que solo se puedan ingresar numeros mayores a 1 para el conteo
                    while (num <= 0){
                        System.out.println("Por favor, ingrese un numero mayor a cero:");
                        num = entrada.nextInt();
                    }
                    System.out.println("Conteo de 1 hasta " + num + ":");
                    // Ciclo para el conteo
                    for(int i = 1; i <= num; i++ ){
                        System.out.println(i);
                    }
                    System.out.println("Fin del conteo.");
                    break;
                case 2:
                    // Clase JOptionPane
                    int num2;
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero mayor a cero: "));
                    while (num2 <= 0){
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese un numero mayor a cero:"));
                    }
                    // Esto es para mostrar el conteo en una sola ventana y no se abran tantas como el numero ingresado
                    String conteo = "";
                    // Ciclo para mostrar el conteo
                    for (int j = 1; j <= num2; j++) {
                    conteo += j + "\n";
                    }
                    JOptionPane.showMessageDialog(null, "Conteo de 1 hasta " + num2 + ":\n" + conteo);
                    JOptionPane.showMessageDialog(null, "Fin del conteo.");
                    break;
                case 3:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion no encontrada. Intente de nuevo");
            }
        }while (opcion != 3);
        entrada.close();
    }
}
