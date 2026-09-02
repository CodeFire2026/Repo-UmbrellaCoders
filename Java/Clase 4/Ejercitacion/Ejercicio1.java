package C4_Ejercitacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
         Ejercicio 1: Pedir numeros hasta quese introduzca un 0,
         mostrar la suma de todos los numeros introducidos
        */
        
        // Clase Scanner
        int num;
        int suma = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Digite un numero: ");
            num = entrada.nextInt();
            suma += num;
            
        }while(num != 0);
        System.out.println("Fin del programa: Ha ingresado 0");
        System.out.println("Suma de los numeros introducidos: " + suma);
        entrada.close();
        
        // Clase JOptionPane
        int num2;
        int suma2 = 0;
        do {
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero: "));
            suma2 += num2;
        }while(num2 != 0);
        JOptionPane.showMessageDialog(null, "Fin del programa: Ha ingresado 0");
        JOptionPane.showMessageDialog(null, "Suma de los numeros introducidos: "+ suma2);
    }
}