import java.util.Scanner;
class Pilha {
    private int[] array;
    private int top;
    
    public Pilha(int capacity) {
        array = new int[capacity];
        top = -1;
    }
    public void push(int element) {
        if (isFull()) {
            System.out.println("Pilha cheia");
            return;
        }
        array[++top] = element;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return -1;
        }
        return array[top--];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == array.length - 1;
    }
}
class TAD {
    private Pilha pilha;
    public TAD(int capacity) {
        pilha = new Pilha(capacity);
    }
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros");
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            pilha.push(numero);
        }
        while (true) {
            System.out.println("Digite a operação (+, -, *, /) ou 'sair' para encerrar:");
            String operacao = scanner.next();
            if (operacao.equals("sair")) {
                break;
            }
            if (pilha.isEmpty()) {
                System.out.println("Pilha vazia");
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
                        System.out.println("Divisão por zero");
                        pilha.push(a);
                        pilha.push(b);
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operação inválida");
                    pilha.push(a);
                    pilha.push(b);
                    continue;
            }
            System.out.println("Resultado: " + resultado);
            pilha.push(resultado);
        }
        scanner.close();
    }
}
public class Exercicio6 {
    public static void main(String[] args) {
        TAD calculadora = new TAD(10);
        calculadora.executar();
    }
}
