import java.util.Random;
import java.util.Scanner;





public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random(42);

        MazoMio zona = new MazoMio(10);
        MazoMio secuenciaJugador = new MazoMio(10);
        MazoMio secuenciaIA = new MazoMio(10);

       
        for (int i = 0; i < 6; i++) {
            String[] carac = {
                "A" + (rnd.nextInt(3) + 1),
                "B" + (rnd.nextInt(2) + 1),
                "C" + (rnd.nextInt(2) + 1),
                "D" + (rnd.nextInt(3) + 1),
                "E" + (rnd.nextInt(2) + 1)
            };
            zona.agregar(new Carta(carac));
        }



        boolean jugando = true;
        while (jugando && !zona.vacia()) {
            


            System.out.println("\n=== TURNO DEL USUARIO ===");
            System.out.println("Cartas disponibles:");
            zona.voltear();
            System.out.println("Tu secuencia:");
            secuenciaJugador.voltear();

            System.out.print("Escoge número de carta para tomar o -1 para pasar: ");
            int eleccion = sc.nextInt();

            if (eleccion >= 0 && eleccion < zona.tamaño()) {
                Carta seleccionada = zona.obtener(eleccion);
                Carta ultima = secuenciaJugador.ultima();

                if (ultima == null || seleccionada.valido(ultima)) {
                    secuenciaJugador.agregar(seleccionada);
                    zona.eliminar(eleccion);
                    System.out.println("Carta añadida.");
                } else {
                    System.out.println("Esa carta no es válida para tu secuencia.");
                }
            } else {
                System.out.println("Pasaste.");
            }

           
            System.out.println("\n=== TURNO DE LA IA ===");
            Carta ultimaIA = secuenciaIA.ultima();
            boolean hizoAlgo = false;
            for (int i = 0; i < zona.tamaño(); i++) {
                Carta candidata = zona.obtener(i);
                if (ultimaIA == null || candidata.valido(ultimaIA)) {
                    secuenciaIA.agregar(candidata);
                    zona.eliminar(i);
                    System.out.println("IA tomó una carta válida.");
                    hizoAlgo = true;
                    break;
                }
            }

            if (!hizoAlgo) {
                System.out.println("IA pasa porque no tiene cartas válidas.");
            }

            if (zona.vacia()) {
                jugando = false;
                System.out.println("\n*** Fin de la ronda ***");
            }
        }

        // voltear resultados
        System.out.println("\nSecuencia del jugador:");
        secuenciaJugador.voltear();
        System.out.println("Secuencia de la IA:");
        secuenciaIA.voltear();

        // Puntos: simplemente contar cartas válidas
        int puntosJugador = secuenciaJugador.tamaño();
        int puntosIA = secuenciaIA.tamaño();

        System.out.println("Puntos del jugador: " + puntosJugador);
        System.out.println("Puntos de la IA: " + puntosIA);

        if (puntosJugador > puntosIA) {
            System.out.println("Ganaste! :D");
        } else if (puntosJugador < puntosIA) {
            System.out.println("Ganó la IA :c'.");
        } else {
            System.out.println("Empate. xd");
        }
    }
}
