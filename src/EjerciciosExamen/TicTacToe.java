package EjerciciosExamen;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        char jugadorActual = 'X';
        boolean juegoTerminado = false;
        
        while (!juegoTerminado) {
            imprimirTablero(tablero);
            hacerMovimiento(tablero, jugadorActual);
            juegoTerminado = verificarGanador(tablero, jugadorActual) || tableroLleno(tablero);
            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }
        
        imprimirTablero(tablero);
        
        if (verificarGanador(tablero, 'X')) {
            System.out.println("¡El jugador X ha ganado!");
        } else if (verificarGanador(tablero, 'O')) {
            System.out.println("¡El jugador O ha ganado!");
        } else {
            System.out.println("¡Es un empate!");
        }
    }
    
    public static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
        System.out.println();
    }
    
    public static void hacerMovimiento(char[][] tablero, char jugador) {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;
        
        do {
            System.out.print("Jugador " + jugador + ", ingresa la fila (1-3) y columna (1-3): ");
            fila = scanner.nextInt() - 1;
            columna = scanner.nextInt() - 1;
        } while (fila < 0 || fila > 2 || columna < 0 || columna > 2 || tablero[fila][columna] != ' ');
        
        tablero[fila][columna] = jugador;
    }
    
    public static boolean verificarGanador(char[][] tablero, char jugador) {
        // Verifica filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true;
            }
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                return true;
            }
        }
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }
        
        return false;
    }
    
    public static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
