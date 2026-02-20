public class AbaixoDiagonal {
    public static void main(String[] args) {
        int[][] matriz = {
            {10, 20, 30}, 
            {40, 50, 60}, 
            {70, 80, 90}  
        };

        System.out.println("=== Elementos Abaixo da Diagonal Principal ===");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("\n-------------------------------------------");
    }
}
