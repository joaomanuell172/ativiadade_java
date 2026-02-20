import java.util.Scanner; 
import java.util.InputMismatchException;
import java.util.ArrayList;

public class atividade { 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("=== Digite números inteiros (ou digite um número negativo para sair) ===");

        while (true) {
            try {
                System.out.print("Digite um número: ");
                int entrada = scanner.nextInt();
                
                if (entrada < 0) {
                    break;
                }
                
                numeros.add(entrada); 
                
            } catch (InputMismatchException e) {
                System.out.println("❌ Erro: Valor inválido! Digite apenas números inteiros.");
                scanner.next(); // 
            }
        }

        int somaPares = 0;
        StringBuilder paresEncontrados = new StringBuilder(); 

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                somaPares += numero;
                paresEncontrados.append(numero).append(" ");
            }
        }

        System.out.println("\n--- Resultado ---");
        if (somaPares == 0 && paresEncontrados.length() == 0) {
            System.out.println("Nenhum número par foi digitado.");
        } else {
            System.out.println("Total de números digitados: " + numeros.size());
            System.out.println("Números pares encontrados: " + paresEncontrados);
            System.out.println("✅ A soma dos números pares é: " + somaPares);
        }

        scanner.close();
    }
}
