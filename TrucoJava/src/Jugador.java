import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase base de los jugadores. Guarda el nombre, la mano de cartas y los
 * puntos. Lo unico que cambia entre un humano y un bot es COMO eligen la
 * carta, por eso elegirCarta() es abstracto.
 */
public abstract class Jugador {

    private final String nombre;
    private final ArrayList<Carta> mano;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumarPuntos(int cantidad) {
        puntos += cantidad;
    }

    public void reiniciarPuntos() {
        puntos = 0;
    }

    /**
     * Recibe una mano nueva: descarta las cartas anteriores y se queda con
     * las que le reparten.
     */
    public void recibirCartas(List<Carta> cartas) {
        mano.clear();
        mano.addAll(cartas);
    }

    /**
     * Devuelve las cartas que tiene en mano (solo lectura).
     */
    public List<Carta> getMano() {
        return Collections.unmodifiableList(mano);
    }

    public boolean tieneCartas() {
        return !mano.isEmpty();
    }

    /**
     * Saca de la mano la carta en la posicion indicada (0 es la primera)
     * y la devuelve. Lo usan las clases hijas dentro de elegirCarta().
     */
    protected Carta sacarCarta(int indice) {
        return mano.remove(indice);
    }

    /**
     * Elige una carta para jugar. La carta elegida SE SACA de la mano y se
     * devuelve. Cada tipo de jugador lo resuelve a su manera.
     */
    public abstract Carta elegirCarta();

    @Override
    public String toString() {
        return nombre;
    }
}
