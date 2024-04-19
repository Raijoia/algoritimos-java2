import java.util.Scanner;

class No {
    int dado;
    No proximo;
    public No(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}
class Lista {
    private No inicio;
    public Lista() {
        this.inicio = null;
    }
    public void inserir(int dado) {
        No novoNo = new No(dado);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }
    public void remover(int dado) {
        while (inicio != null && inicio.dado == dado) {
            inicio = inicio.proximo;
        }
        if (inicio == null) {
            return;
        }
        No atual = inicio;
        while (atual.proximo != null) {
            if (atual.proximo.dado == dado) {
                atual.proximo = atual.proximo.proximo;
            } else {
                atual = atual.proximo;
            }
        }
    }
    public void mostrar() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado);
            atual = atual.proximo;
        }
        System.out.println();
    }
}
public class exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        Lista lista = new Lista();
        for (int i = 0; i < frase.length(); i++) {
            lista.inserir(frase.charAt(i));
        }
        System.out.print("Digite o caractere a ser removido: ");
        char caractere = scanner.next().charAt(0);
        lista.remover(caractere);
        System.out.println("Frase resultante:");
        lista.mostrar();
        scanner.close();
    }
}
