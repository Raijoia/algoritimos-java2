import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exercicio12 {

    // Método para calcular as operações matemáticas
    public static int calcular(char operador, int num1, int num2) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> fila = new ArrayDeque<>();

        // Captura dos números do usuário
        System.out.println("Digite cinco números inteiros:");
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            fila.offer(num);
        }

        // Operações matemáticas
        while (true) {
            System.out.print("Digite a operação (+, -, *, /) ou 'sair' para encerrar: ");
            char operador = scanner.next().charAt(0);

            if (operador == 's' || operador == 'S') {
                break;
            }

            if (operador == '+' || operador == '-' || operador == '*' || operador == '/') {
                if (fila.size() >= 2) {
                    int num1 = fila.poll();
                    int num2 = fila.poll();
                    int resultado = calcular(operador, num1, num2);
                    fila.offerFirst(resultado);
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Não há números suficientes na fila para realizar a operação.");
                }
            } else {
                System.out.println("Operação inválida.");
            }
        }

        System.out.println("Fim do programa.");
        scanner.close();
    }
}
