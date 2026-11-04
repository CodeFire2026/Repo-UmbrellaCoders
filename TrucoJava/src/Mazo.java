import java.util.ArrayList;
import java.util.Random;

/**
 * El mazo de 40 cartas. Se arma, se mezcla y reparte cartas.
 */
public class Mazo {

    private final ArrayList<Carta> cartas;
    private final Random azar;

    public Mazo() {
        cartas = new ArrayList<>();
        azar = new Random();
        armar();
    }

    // Crea las 40 cartas: 4 palos x 10 numeros (del 1 al 12 sin 8 ni 9)
    private void armar() {
        cartas.clear();
        for (String palo : Carta.PALOS) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }

    /**
     * Mezcla el mazo con el algoritmo de Fisher-Yates: recorre de atras
     * para adelante e intercambia cada carta con otra de posicion al azar.
     */
    public void mezclar() {
        for (int i = cartas.size() - 1; i > 0; i--) {
            int j = azar.nextInt(i + 1);
            Carta temporal = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temporal);
        }
    }

    /**
     * Vuelve a armar las 40 cartas y las mezcla. Se usa al empezar cada mano.
     */
    public void reiniciar() {
        armar();
        mezclar();
    }

    /**
     * Saca 'cantidad' cartas de arriba del mazo y las devuelve.
     */
    public ArrayList<Carta> repartir(int cantidad) {
        if (cantidad < 0 || cantidad > cartas.size()) {
            throw new IllegalArgumentException(
                "No se pueden repartir " + cantidad + " cartas, quedan " + cartas.size());
        }
        ArrayList<Carta> repartidas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            repartidas.add(cartas.remove(cartas.size() - 1));
        }
        return repartidas;
    }

    public int cartasRestantes() {
        return cartas.size();
    }
}
