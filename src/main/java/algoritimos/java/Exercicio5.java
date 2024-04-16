import java.util.Scanner;
import java.util.Stack;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        System.out.println("Digite 5 números inteiros");
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            pilha.push(numero);
        }
        while (true) {
            System.out.println("Digite uma das opçoes (+, -, *, /) ou 'sair' para encerrar:");
            String operacao = scanner.next();
            if (operacao.equals("sair")) {
                break;
            }
            if (pilha.size() < 2) {
                System.out.println("É necessário pelo menos 2 números na pilha para realizar uma operação.");
                continue;
            }
            int b = pilha.pop();
            int a = pilha.pop();
            int resultado = 0;
            switch (operacao) {
                case "+":
                    resultado = a + b;
                    break;
                case "-":
                    resultado = a - b;
                    break;
                case "*":
                    resultado = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        resultado = a / b;
                    } else {
                        System.out.println("Tente novamente divisao por 0");
                        pilha.push(a);
                        pilha.push(b);
                        continue;
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
                    pilha.push(a);
                    pilha.push(b);
                    continue;
            }
            System.out.println("Resultado " + resultado);
            pilha.push(resultado);
        }
        scanner.close();
    }
}
