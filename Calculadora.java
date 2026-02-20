import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Calculadora (Digite 'EXIT' para sair) ---");
            System.out.print("Digite o primeiro valor (ou EXIT): ");
            String entrada = scanner.next();

            if (entrada.equalsIgnoreCase("EXIT")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            try {
                double val1 = Double.parseDouble(entrada);

                System.out.print("Digite o símbolo (+, -, *, /, **): ");
                String simbolo = scanner.next();

                System.out.print("Digite o segundo valor: ");
                double val2 = scanner.nextDouble();

                double resultado = 0;
                boolean operacaoValida = true;

                switch (simbolo) {
                    case "+":
                        resultado = val1 + val2;
                        break;
                    case "-":
                        resultado = val1 - val2;
                        break;
                    case "*":
                        resultado = val1 * val2;
                        break;
                    case "/":
                        if (val2 == 0) {
                            System.out.println(" Erro: A divisão por zero não pode ser feita.");
                            operacaoValida = false;
                        } else {
                            resultado = val1 / val2;
                        }
                        break;
                    case "**":
                        resultado = Math.pow(val1, val2);
                        break;
                    default:
                        System.out.println(" Impossível realizar a operação (símbolo inválido).");
                        operacaoValida = false;
                }

                if (operacaoValida) {
                    System.out.println(" Resultado: " + resultado);
                }

            } catch (NumberFormatException e) {
                System.out.println(" Erro: Por favor, digite um número válido.");
            } catch (Exception e) {
                System.out.println(" Ocorreu um erro inesperado.");
                scanner.next(); // Limpa o scanner
            }
        }
        scanner.close();
    }
}
