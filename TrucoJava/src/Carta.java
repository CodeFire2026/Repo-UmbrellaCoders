/**
 * Representa una carta de la baraja espanola de 40 cartas (sin 8 ni 9).
 * Sabe cual es su jerarquia (fuerza) en el truco.
 */
public class Carta {

    public static final String[] PALOS = {"espada", "basto", "oro", "copa"};

    private final int numero;
    private final String palo;

    public Carta(int numero, String palo) {
        if (!numeroValido(numero)) {
            throw new IllegalArgumentException("Numero de carta invalido: " + numero);
        }
        if (!paloValido(palo)) {
            throw new IllegalArgumentException("Palo invalido: " + palo);
        }
        this.numero = numero;
        this.palo = palo;
    }

    private static boolean numeroValido(int numero) {
        return numero >= 1 && numero <= 12 && numero != 8 && numero != 9;
    }

    private static boolean paloValido(String palo) {
        for (String p : PALOS) {
            if (p.equals(palo)) {
                return true;
            }
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    /**
     * Devuelve la fuerza de la carta en el truco: cuanto mas alto el valor,
     * mas fuerte es la carta. El ORDEN de los if es importante, porque las
     * cartas especiales se chequean antes que las comunes.
     *
     * Orden de mayor a menor:
     * 1 espada, 1 basto, 7 espada, 7 oro, 3, 2, 1 (oro y copa),
     * 12, 11, 10, 7 (copa y basto), 6, 5, 4
     */
    public int getJerarquia() {
        if (numero == 1 && palo.equals("espada")) return 14;
        if (numero == 1 && palo.equals("basto"))  return 13;
        if (numero == 7 && palo.equals("espada")) return 12;
        if (numero == 7 && palo.equals("oro"))    return 11;
        if (numero == 3)  return 10;
        if (numero == 2)  return 9;
        if (numero == 1)  return 8;   // 1 de oro y 1 de copa
        if (numero == 12) return 7;
        if (numero == 11) return 6;
        if (numero == 10) return 5;
        if (numero == 7)  return 4;   // 7 de copa y 7 de basto
        if (numero == 6)  return 3;
        if (numero == 5)  return 2;
        return 1;                     // el 4
    }

    /**
     * Compara esta carta con otra segun la jerarquia del truco.
     * Devuelve un numero positivo si esta carta gana, negativo si pierde
     * y 0 si empatan (parda).
     */
    public int compararCon(Carta otra) {
        return this.getJerarquia() - otra.getJerarquia();
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}
