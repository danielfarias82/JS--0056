package juegoGrupal;

import java.util.Scanner;

public class juego {
	public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego Piedra, Papel y Tijera!");
        int game = 1;
        int game1, game2;
        boolean aux1, aux2;
        do {
            game = 1;
            do {
                System.out.println("Primer Jugador (1) Tijera, (2) Papel y (3) Piedra:");
                String jugador1 = scanner.nextLine();
                switch (jugador1) {
                    case "1":
                        aux1 = true;
                        game1 = 1;
                        break;
                    case "2":
                        aux1 = true;
                        game1 = 2;
                        break;
                    case "3":
                        aux1 = true;
                        game1 = 3;
                        break;
                    default:
                        aux1 = false;
                        game1 = 0;
                        break;
                }
            } while (!aux1);
            do {
                System.out.println("Segundo Jugador: (1) Tijera, (2) Papel y (3) Piedra");
                String jugador2 = scanner.nextLine();
                switch (jugador2) {
                    case "1":
                        aux2 = true;
                        game2 = 1;
                        break;
                    case "2":
                        aux2 = true;
                        game2 = 2;
                        break;
                    case "3":
                        aux2 = true;
                        game2 = 3;
                        break;
                    default:
                        aux2 = false;
                        game2 = 0;
                        break;
                }
            } while (!aux2);
            if (game1 == game2) {
                System.out.println("Empate!!!");
            } else if ((game1 == 1 && game2 == 2) || (game1 == 2 && game2 == 3) || (game1 == 3 && game2 == 1)) {
                System.out.println("Gana jugador 1!!!");
            } else {
                System.out.println("Gana jugador 2!!!");
            }
            System.out.println("¿Quieres jugar de nuevo? (SI (1), NO (0))");
            game = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente después de nextInt()
        } while (game == 1);
        System.out.println("Gracias por jugar. ¡Chaito!");
    }
}











