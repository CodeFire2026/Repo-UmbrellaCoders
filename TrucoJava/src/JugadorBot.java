import java.util.Random;

/**
 * Jugador controlado por la computadora. Primera version: elige una carta
 * al azar de las que le quedan. No imprime nada: de anunciar la jugada se
 * encarga la clase Mano.
 */
public class JugadorBot extends Jugador {

    private final Random azar;

    public JugadorBot(String nombre) {
        super(nombre);
        this.azar = new Random();
    }

    @Override
    public Carta elegirCarta() {
        if (!tieneCartas()) {
            throw new IllegalStateException(getNombre() + " no tiene cartas para jugar");
        }
        int indice = azar.nextInt(getMano().size());
        return sacarCarta(indice);
    }
}
