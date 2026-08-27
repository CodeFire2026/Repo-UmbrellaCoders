package C3_Ejercitacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Ejercicio 3: Realizar un juego para adivinar un numero:
        // generar un numero aleatorio entre 0-100, luego ir pidiendo numeros
        // indicando si es mayor o menor al numero aleatorio.
        // El programa termina cuando el usuario acierta y mostramos la cantidad
        // de intentos hechos.
        
        // Clase Scanner
        
        Scanner entrada = new Scanner(System.in);
        int aleatorio = (int)(Math.random()* 101);
        int num;
        int intentos = 0;
        System.out.println("=== ADIVINA EL NUMERO ===");
        do{
            System.out.println("Ingrese un numero: ");
            num = entrada.nextInt();
            intentos++;
            if (num < aleatorio){
                System.out.println("El numero secreto es mayor");
            }else if(num > aleatorio) {
                System.out.println("El numero secreto es menor");
            }
        }while(num != aleatorio);
        System.out.println("=== ¡Has Ganado! ===");
        System.out.println("Numero secreto: "+aleatorio);
        System.out.println("Cantidad de intentos: "+intentos);
        entrada.close();
        
        // Clase JOptionPane
        int aleatorio2 = (int)(Math.random()* 101);
        int num2;
        int intentos2 = 0;
        JOptionPane.showMessageDialog(null, "=== ADIVINA EL NUMERO ===");
        do{
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            intentos2++;
            if (num2 < aleatorio2){
                JOptionPane.showMessageDialog(null, "El numero secreto es mayor");
            }else if(num2 > aleatorio2) {
                JOptionPane.showMessageDialog(null, "El numero secreto es menor");
            }
        }while(num2 != aleatorio2);
        JOptionPane.showMessageDialog(null, "=== ¡Has Ganado! ===");
        JOptionPane.showMessageDialog(null, "Numero secreto: "+aleatorio2);
        JOptionPane.showMessageDialog(null, "Cantidad de intentos: "+intentos2); 
    }
    
}
