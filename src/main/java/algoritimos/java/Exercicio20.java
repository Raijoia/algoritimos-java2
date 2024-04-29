import java.util.Scanner;

// Classe FilaCircular para representar uma fila circular de números inteiros
class Exercicio20 {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
   
            private int[] elementos;
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;

    public FilaCircular(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    public void enfileirar(int elemento) {
        if (tamanho < capacidade) {
            fim = (fim + 1) % capacidade;
            elementos[fim] = elemento;
            tamanho++;
        } else {
            throw new IllegalStateException("A fila está cheia.");
        }
    }

    public int desenfileirar() {
        if (tamanho > 0) {
            int elementoRemovido = elementos[inicio];
            inicio = (inicio + 1) % capacidade;
            tamanho--;
            return elementoRemovido;
        } else {
            throw new IllegalStateException("A fila está vazia.");
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getPrimeiroElemento() {
        if (tamanho > 0) {
            return elementos[inicio];
        } else {
            throw new IllegalStateException("A fila está vazia.");
        }
    }
}

// Classe Calculadora para realizar as operações matemáticas
class Calculadora {
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
}

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaCircular fila = new FilaCircular(5);

        // Captura dos números do usuário
        System.out.println("Digite cinco números inteiros:");
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            fila.enfileirar(num);
        }

        // Operações matemáticas
        while (true) {
            System.out.print("Digite a operação (+, -, *, /) ou 'sair' para encerrar: ");
            char operador = scanner.next().charAt(0);

            if (operador == 's' || operador == 'S') {
                break;
            }

            if (operador == '+' || operador == '-' || operador == '*' || operador == '/') {
                if (fila.getTamanho() >= 2) {
                    int num1 = fila.desenfileirar();
                    int num2 = fila.desenfileirar();
                    int resultado = Calculadora.calcular(operador, num1, num2);
                    fila.enfileirar(resultado);
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
