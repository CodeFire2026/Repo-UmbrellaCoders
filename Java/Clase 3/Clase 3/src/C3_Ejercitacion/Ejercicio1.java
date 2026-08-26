package C3_Ejercitacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Ejercicio 1: Leer numeros hasta que se introduzca un 0
        // Para cada uno indicar si es par o impar
        // Pimero con la clase Scanner luego con la clase JOptionPane
        
        // Clase Scanner
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite un numero: ");
            num = entrada.nextInt();
            if (num % 2 == 0){
                System.out.println("Numero Par");
            }else {
                System.out.println("Numero Impar");
            }
        } while(num != 0);
        System.out.println("Fin del programa: Ha ingresado un cero");
        entrada.close();
                
        // Clase JOptionPane
        int num2;
        do {
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if(num2 % 2 == 0){
                JOptionPane.showMessageDialog(null, "Numero Par");
            }else{
                JOptionPane.showMessageDialog(null, "Numero Impar");
            }
        }while(num2 != 0);
        JOptionPane.showMessageDialog(null, "Fin del Programa: Ha ingresado cero");
    }
    
}
