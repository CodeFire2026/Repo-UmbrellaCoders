import java.util.Scanner;

/**
 * Prueba TEMPORAL de las clases de Persona 1. No forma parte del juego final:
 * sirve para comprobar que Carta, Mazo y los jugadores funcionan antes de
 * juntarlos con el codigo de Persona 2.
 */
public class PruebaPiezas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1) Jerarquia de cartas
        System.out.println("=== Jerarquia ===");
        Carta unoEspada = new Carta(1, "espada");
        Carta unoBasto = new Carta(1, "basto");
        Carta sieteOro = new Carta(7, "oro");
        Carta tresCopa = new Carta(3, "copa");
        Carta cuatroOro = new Carta(4, "oro");
        Carta cuatroCopa = new Carta(4, "copa");
        System.out.println(unoEspada + " vs " + unoBasto + " -> " + unoEspada.compararCon(unoBasto) + " (positivo: gana la primera)");
        System.out.println(sieteOro + " vs " + tresCopa + " -> " + sieteOro.compararCon(tresCopa) + " (positivo: gana la primera)");
        System.out.println(cuatroOro + " vs " + tresCopa + " -> " + cuatroOro.compararCon(tresCopa) + " (negativo: gana la segunda)");
        System.out.println(cuatroOro + " vs " + cuatroCopa + " -> " + cuatroOro.compararCon(cuatroCopa) + " (0: parda)");

        // 2) Mazo
        System.out.println();
        System.out.println("=== Mazo ===");
        Mazo mazo = new Mazo();
        System.out.println("Cartas al crear: " + mazo.cartasRestantes());
        mazo.mezclar();
        JugadorHumano humano = new JugadorHumano("Miguel", teclado);
        JugadorBot bot = new JugadorBot("Bot");
        humano.recibirCartas(mazo.repartir(3));
        bot.recibirCartas(mazo.repartir(3));
        System.out.println("Cartas despues de repartir: " + mazo.cartasRestantes());

        // 3) Jugadores: se juegan las 3 bazas
        System.out.println();
        System.out.println("=== Jugadores ===");
        for (int baza = 1; baza <= 3; baza++) {
            System.out.println("--- Baza " + baza + " ---");
            Carta cartaHumano = humano.elegirCarta();
            Carta cartaBot = bot.elegirCarta();
            System.out.println("Vos jugaste: " + cartaHumano);
            System.out.println("Bot jugo: " + cartaBot);
            int resultado = cartaHumano.compararCon(cartaBot);
            if (resultado > 0) {
                System.out.println("Gana " + humano.getNombre());
            } else if (resultado < 0) {
                System.out.println("Gana " + bot.getNombre());
            } else {
                System.out.println("Parda");
            }
        }

        // 4) Puntos
        humano.sumarPuntos(2);
        System.out.println();
        System.out.println("Puntos de " + humano.getNombre() + ": " + humano.getPuntos());
        System.out.println("Le quedan cartas? " + humano.tieneCartas());
    }
}
