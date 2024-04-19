import java.util.Scanner;
class No {
    int valor;
    No esquerda, direita;
    public No(int item) {
        valor = item;
        esquerda = direita = null;
    }
}
class Arvore {
    No raiz;
    Arvore() {
        raiz = null;
    }
    void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }
    No inserirRec(No raiz, int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }
        if (valor < raiz.valor)
            raiz.esquerda = inserirRec(raiz.esquerda, valor);
        else if (valor > raiz.valor)
            raiz.direita = inserirRec(raiz.direita, valor);

        return raiz;
    }
    void preOrdem(No raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            preOrdem(raiz.esquerda);
            preOrdem(raiz.direita);
        }
    }
    void apresentarArvore() {
        System.out.println("Árvore Binária (Acesso Pré-Ordenado):");
        preOrdem(raiz);
        System.out.println();
    }
    No encontrarMenorValorNo(No raiz) {
        No atual = raiz;
        while (atual.esquerda != null)
            atual = atual.esquerda;

        return atual;
    }
    No removerNo(No raiz, int valor) {
        if (raiz == null)
            return raiz;

        if (valor < raiz.valor)
            raiz.esquerda = removerNo(raiz.esquerda, valor);
        else if (valor > raiz.valor)
            raiz.direita = removerNo(raiz.direita, valor);
        else {
            if (raiz.esquerda == null)
                return raiz.direita;
            else if (raiz.direita == null)
                return raiz.esquerda;
            raiz.valor = encontrarMenorValorNo(raiz.direita).valor;

            raiz.direita = removerNo(raiz.direita, raiz.valor);
        }
        return raiz;
    }
    void eliminarNo(int valor) {
        raiz = removerNo(raiz, valor);
    }
}
public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arvore arvore = new Arvore();
        char opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("A- Inserir Nó na Árvore (Acesso Pré-Ordenado)");
            System.out.println("B- Apresentar Árvore");
            System.out.println("C- Eliminar Nó da Árvore (Digitado o Conteúdo do Nó)");
            System.out.println("D- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.next().charAt(0);
            switch (opcao) {
                case 'A':
                    System.out.print("Digite o valor a ser inserido: ");
                    int valorInserir = scanner.nextInt();
                    arvore.inserir(valorInserir);
                    break;
                case 'B':
                    arvore.apresentarArvore();
                    break;
                case 'C':
                    System.out.print("Digite o valor do nó a ser eliminado: ");
                    int valorEliminar = scanner.nextInt();
                    arvore.eliminarNo(valorEliminar);
                    break;
                case 'D':
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 'D');
    }
}
