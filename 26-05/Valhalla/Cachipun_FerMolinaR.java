package tareas;
import java.util.Scanner;

public class Cachipun2 {
    public static Scanner scanner = new Scanner(System.in);
    
    public static int validarNumero(String frase) {
        int opcion = 0;
        
        do {
            System.out.println(frase);
            System.out.println("1-tijera\n" + "2-papel\n" + "3-piedra\n");
            opcion = scanner.nextInt();
            
        } while (opcion <= 0 || opcion > 3);
        
        return opcion;
    }
    
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            int opcionJugador1 = 0, opcionJugador2 = 0;

            opcionJugador1 = validarNumero("Jugador 1, ingrese una opción válida:");
            opcionJugador2 = validarNumero("Jugador 2, ingrese una opción válida:");

            switch (opcionJugador1) {
                case 1:
                    if (opcionJugador2 == 1) {
                        System.out.println("Ustedes han empatado");
                    } else if (opcionJugador2 == 2) {
                        System.out.println("Ha ganado el Jugador 1");
                    } else {
                        System.out.println("Ha ganado el Jugador 2");
                    }
                    break;
                case 2:
                    if (opcionJugador2 == 1) {
                        System.out.println("Ha ganado el Jugador 2");
                    } else if (opcionJugador2 == 2) {
                        System.out.println("Ustedes han empatado");
                    } else {
                        System.out.println("Ha ganado el Jugador 1");
                    }
                    break;
                case 3:
                    if (opcionJugador2 == 1) {
                        System.out.println("Ha ganado el Jugador 1");
                    } else if (opcionJugador2 == 2) {
                        System.out.println("Ha ganado el Jugador 2");
                    } else {
                        System.out.println("Ustedes han empatado");
                    }
                    break;
                default:
                    break;
            }

            System.out.println("¿Desea jugar otra vez? (S/N)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        return; // Incorporando la sentencia "return" para salir del método "main"
    }
}