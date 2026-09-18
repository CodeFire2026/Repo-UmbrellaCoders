package caja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaCaja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        Proyecto Caja:
        Ejercitacion: Crear un proyecto segun las sgtes espécificaciones:
        La formula es: volumen = alto * ancho * profundidad
        */
        System.out.println("=== Calculador de volumen de cajas ===");
        int opcion;
        // Ciclo para el menu
        do{
            System.out.println("\nElija el modo de ejecucion del programa");
            System.out.println("1 - Consola con Scanenr\n2 - Ventanas con JOptionPane\n3 - Cerrar");
            System.out.println("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion){
            case 1:
                // Clase Scanner
                // Constructor vacio
                System.out.println("Constructor 1:");
                Caja caja1 = new Caja();
                // Valores ingresados por el usuario
                System.out.println("Digite el alto de la caja: ");
                caja1.alto = entrada.nextDouble();
                System.out.println("Digite el ancho de la caja: ");
                caja1.ancho = entrada.nextDouble();
                System.out.println("Digite la profundidad de la caja: ");
                caja1.profundidad = entrada.nextDouble();
                System.out.println("Volumen de la caja: " + caja1.calcularVolumenCaja());
                break;
            case 2:
                // Clase JOptionPane
                // Constructor con argumentos
                double alto, ancho, profundidad;
                // Esto es para que el usuario ingrese los valores dentro de estas variables, 
                //y pasar los argumentos al constructor
                alto = Double.parseDouble(JOptionPane.showInputDialog("Digite el alto de la caja: "));
                ancho = Double.parseDouble(JOptionPane.showInputDialog("Digite el ancho de la caja: "));
                profundidad = Double.parseDouble(JOptionPane.showInputDialog("Digite la profundidad de la caja: "));
                Caja caja2 = new Caja(alto, ancho, profundidad);
                JOptionPane.showMessageDialog(null,"Volumen de la caja: " + caja2.calcularVolumenCaja());
                break;
            case 3:
                System.out.println("Cerrando programa...");
                break;
            default:
                System.out.println("Opcion no valida");
            }
        } while (opcion != 3);
        System.out.println("Programa finalizado");
        entrada.close();
    }
}
