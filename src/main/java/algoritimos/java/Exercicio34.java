package algoritimos.java;
import java.util.Scanner;
import algoritimos.java.TADs.ArvoreBinariaPreOrdenada;

public class Exercicio34 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArvoreBinariaPreOrdenada arvore = new ArvoreBinariaPreOrdenada();
    char opcao;
    do {
        System.out.println("\nMenu:");
        System.out.println("A- Inserir nó na árvore (Acesso Pré-Ordenado)");
        System.out.println("B- Apresentar árvore");
        System.out.println("C- Buscar nó");
        System.out.println("D- Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.next().charAt(0);
        switch (opcao) {
            case 'A':
                System.out.print("Digite o valor a ser inserido: ");
                int valor = scanner.nextInt();
                arvore.inserir(valor);
                break;
            case 'B':
                arvore.preOrdem();
                System.out.println();
                break;
            case 'C':
                System.out.print("Digite o nó que deseja buscar: ");
                int busca = scanner.nextInt();
                arvore.buscar(busca);
                break;
            case 'D':
                System.out.println("Encerrando o programa...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    } while (opcao != 'D');
    scanner.close();
  }
}
