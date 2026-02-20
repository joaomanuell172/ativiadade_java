public class OperacoesMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int tamanho = matriz.length;
        int somaTotal = 0;

        // 1. Exibindo a Diagonal Secundária
        System.out.println("=== Diagonal Secundária ===");
        for (int i = 0; i < tamanho; i++) {
            // A coluna é o (tamanho - 1) menos o índice da linha
            System.out.print(matriz[i][tamanho - 1 - i] + " ");
        }

        // 2. Calculando a Soma de TODOS os elementos
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                somaTotal += matriz[i][j];
            }
        }

        System.out.println("\n\n--- Resultados ---");
        System.out.println("✅ A soma de todos os valores é: " + somaTotal);
    }
}
