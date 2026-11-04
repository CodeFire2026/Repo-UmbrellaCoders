import java.util.List;
import java.util.Scanner;

/**
 * Jugador controlado por una persona: muestra sus cartas y pide por
 * teclado cual jugar, validando que la entrada sea correcta.
 */
public class JugadorHumano extends Jugador {

    // Se recibe el Scanner desde afuera para usar UNO SOLO en todo el programa
    private final Scanner teclado;

    public JugadorHumano(String nombre, Scanner teclado) {
        super(nombre);
        this.teclado = teclado;
    }

    @Override
    public Carta elegirCarta() {
        if (!tieneCartas()) {
            throw new IllegalStateException(getNombre() + " no tiene cartas para jugar");
        }

        List<Carta> mano = getMano();
        System.out.println("Tus cartas:");
        for (int i = 0; i < mano.size(); i++) {
            System.out.println("  " + (i + 1) + ") " + mano.get(i));
        }

        int opcion = 0;
        boolean valida = false;
        while (!valida) {
            System.out.print("Elegi una carta (1-" + mano.size() + "): ");
            String entrada = teclado.nextLine().trim();
            try {
                opcion = Integer.parseInt(entrada);
                if (opcion >= 1 && opcion <= mano.size()) {
                    valida = true;
                } else {
                    System.out.println("Esa opcion no existe, elegi entre 1 y " + mano.size() + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida, escribi solo el numero de la carta.");
            }
        }

        return sacarCarta(opcion - 1);
    }
}
