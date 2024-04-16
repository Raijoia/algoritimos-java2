package algoritimos.java;

import java.util.Scanner;

public class Exercicio1 {
  public static class Pilha {

    private static final int TAMANHO_MAXIMO = 10;
    private char[] elementos;
    private int topo;

    public Pilha() {
      elementos = new char[TAMANHO_MAXIMO];
      topo = -1;
    }

    public void inserirElemento(char elemento) {
      if (topo < TAMANHO_MAXIMO - 1) {
        topo++;
        elementos[topo] = elemento;
        System.out.println("Elemento inserido com sucesso.");
      } else {
        System.out.println("A pilha está cheia, não é possível inserir mais elementos.");
      }
    }

    public void consultarElemento() {
      if (topo >= 0) {
        System.out.println("Último elemento inserido: " + elementos[topo]);
        System.out.println("Quantidade de elementos na pilha: " + (topo + 1));
      } else {
        System.out.println("A pilha está vazia.");
      }
    }

    public void retirarElemento() {
      if (topo >= 0) {
        char elemento = elementos[topo];
        topo--;
        System.out.println("Elemento retirado: " + elemento);
      } else {
        System.out.println("A pilha está vazia.");
      }
    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Pilha pilha = new Pilha();
      int opcao;

      do {
        System.out.println("\nMenu:");
        System.out.println("1. Inserir Elemento");
        System.out.println("2. Consultar Elemento");
        System.out.println("3. Retirar Elemento");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
          case 1:
            System.out.print("Digite o elemento a ser inserido: ");
            char elemento = scanner.next().charAt(0);
            pilha.inserirElemento(elemento);
            break;
          case 2:
            pilha.consultarElemento();
            break;
          case 3:
            pilha.retirarElemento();
            break;
          case 4:
            System.out.println("Encerrando o programa.");
            break;
          default:
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }

      } while (opcao != 4);

      scanner.close();
    }
  }
}
