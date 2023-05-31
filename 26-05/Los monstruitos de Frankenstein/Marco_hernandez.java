package Base3;


	import java.util.Scanner;

	public class Game2 {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		
		        int rondas, victoriasJugador1 = 0, victoriasJugador2 = 0;

		        System.out.print("Ingrese el número de rondas para la Batalla del Cachipumm: ");
		        rondas = scanner.nextInt();
		        scanner.nextLine();

		        for (int i = 1; i <= rondas; i++) {
		            System.out.println("\n--- Ronda " + i + " ---");

		            String jugador1 = obtenerJugada(scanner, "Jugador 1");
		            String jugador2 = obtenerJugada(scanner, "Jugador 2");

		            String resultado = jugarPiedraPapelTijera(jugador1, jugador2);
		            System.out.println(resultado);

		            if (resultado.contains("1")) {
		                victoriasJugador1++;
		            } else if (resultado.contains("2")) {
		                victoriasJugador2++;
		            }
		        }

		        System.out.println("\n--- Resultados finales ---");
		        System.out.println("Jugador 1: " + victoriasJugador1 + " victorias");
		        System.out.println("Jugador 2: " + victoriasJugador2 + " victorias");

		        if (victoriasJugador1 == victoriasJugador2) {
		            System.out.println("¡Empate!");
		        } else if (victoriasJugador1 > victoriasJugador2) {
		            System.out.println("¡Jugador 1 gana el juego!");
		        } else {
		            System.out.println("¡Jugador 2 gana el juego!");
		        }
		    }

		    public static String obtenerJugada(Scanner scanner, String jugador) {
		        String[] opciones = {"piedra", "papel", "tijera"};
		        System.out.print(jugador + ", elige piedra, papel, tijera o barita magica: ");
		        String eleccion = scanner.nextLine().toLowerCase();
		        if (!eleccion.equals("piedra") && !eleccion.equals("papel") && !eleccion.equals("tijera")) {
		            System.out.println("LA JUGADA NO ES VALIDA OOOEEE!!!!. JJUEGA lIMPIO LARVA!!!");
		            System.exit(0);
		        }
		        return eleccion;
		    }

		    public static String jugarPiedraPapelTijera(String jugador1, String jugador2) {
		        String[][] resultados = {{"Es un empate.", "¡Jugador 2 gana!", "¡Jugador 1 gana!"},
		                                 {"¡Jugador 1 gana!", "Es un empate.", "¡Jugador 2 gana!"},
		                                 {"¡Jugador 2 gana!", "¡Jugador 1 gana!", "Es un empate."}};
		        int indiceJugador1 = obtenerIndiceJugada(jugador1);
		        int indiceJugador2 = obtenerIndiceJugada(jugador2);
		        return resultados[indiceJugador1][indiceJugador2];
		    }

		    public static int obtenerIndiceJugada(String jugada) {
		        String[] opciones = {"piedra", "papel", "tijera"};
		        for (int i = 0; i < opciones.length; i++) {
		            if (jugada.equals(opciones[i])) {
		                return i;
		            }
		        }
		        return -1;
		    }
		}
