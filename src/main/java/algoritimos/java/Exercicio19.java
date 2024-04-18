import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> filaCircular = new LinkedList<>();

        System.out.println("Digite 5 numeros inteiros:");

        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            filaCircular.offer(numero);
        }
        while (true) {
            System.out.println("\nEscolha a operação matemática:");
            System.out.println("1. Adição (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("5. Sair");
            int escolha = scanner.nextInt();
            if (escolha == 5) {
                System.out.println("Programa encerrado.");
                break;
            }
            System.out.println("Digite o valor para a operaçao");
            int valor = scanner.nextInt();
            int primeiroNumero = filaCircular.poll();
            int resultado = 0;
            switch (escolha) {
                case 1:
                    resultado = primeiroNumero + valor;
                    System.out.println("Resultado da adiçao: " + resultado);
                    break;
                case 2:
                    resultado = primeiroNumero - valor;
                    System.out.println("Resultado da subtraçao " + resultado);
                    break;
                case 3:
                    resultado = primeiroNumero * valor;
                    System.out.println("Resultado da multiplicaçao " + resultado);
                    break;
                case 4:
                    if (valor != 0) {
                        resultado = primeiroNumero / valor;
                        System.out.println("Resultado da divisao " + resultado);
                    } else {
                        System.out.println("Errro divisão por 0");
                    }
                    break;
                default:
                    System.out.println("Opção invalida");
            }
            filaCircular.offer(resultado);
        }
        scanner.close();
    }
}
