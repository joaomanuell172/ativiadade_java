import java.util.Scanner;
import java.util.InputMismatchException;

public class MatrizInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declaração da matriz 3x3 (3 linhas e 3 colunas)
        int[][] matriz = new int[3][3];

        System.out.println("=== Preenchimento da Matriz 3x3 ===");

        // Loop para percorrer as LINHAS
        for (int i = 0; i < 3; i++) {
            // Loop para percorrer as COLUNAS
            for (int j = 0; j < 3; j++) {
                boolean entradaValida = false;
                
                while (!entradaValida) {
                    try {
                        System.out.printf("Digite o valor para [%d][%d]: ", i, j);
                        matriz[i][j] = scanner.nextInt();
                        entradaValida = true; // Sai do loop se for um inteiro
                    } catch (InputMismatchException e) {
                        System.out.println("❌ Erro: Apenas números inteiros são aceitos. Tente novamente.");
                        scanner.next(); // Limpa o buffer do teclado
                    }
                }
            }
        }

        // Exibição da matriz formatada
        System.out.println("\n--- Matriz Digitada ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // \t adiciona um espaçamento (tabulação) entre os números
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Pula para a próxima linha após imprimir as colunas
        }

        scanner.close();
    }
}
