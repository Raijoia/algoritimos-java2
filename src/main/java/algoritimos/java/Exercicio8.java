package algoritimos.java;

import java.util.Scanner;

public class Exercicio8 {
  public static class Fila {
    public static final int TAMANHO_MAXIMO = 10;
    public static char[] fila = new char[TAMANHO_MAXIMO];
    public static int tamanho = 0;
    public static int inicio = 0;
    public static int fim = 0;

    public static void inserirElemento(char elemento) {
      if (tamanho < TAMANHO_MAXIMO) {
        fila[fim] = elemento;
        fim = (fim + 1) % TAMANHO_MAXIMO;
        tamanho++;
        System.out.println("Elemento inserido com sucesso!");
      } else {
        System.out.println("A fila está cheia. Não é possível inserir mais elementos.");
      }
    }

    public static void consultarElemento() {
      if (tamanho > 0) {
        System.out.println("Primeiro elemento na fila: " + fila[inicio]);
        System.out.println("Quantidade de elementos na fila: " + tamanho);
      } else {
        System.out.println("A fila está vazia. Não há elementos para consultar.");
      }
    }

    public static void retirarElemento() {
      if (tamanho > 0) {
        char elementoRetirado = fila[inicio];
        inicio = (inicio + 1) % TAMANHO_MAXIMO;
        tamanho--;
        System.out.println("Elemento retirado: " + elementoRetirado);
      } else {
        System.out.println("A fila está vazia. Não há elementos para retirar.");
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Fila fila = new Fila();
    int opcao;

    do {
      System.out.println("\nEscolha uma opção:");
      System.out.println("1 - Inserir Elemento");
      System.out.println("2 - Consultar Elemento");
      System.out.println("3 - Retirar Elemento");
      System.out.println("0 - Sair");
      System.out.print("Opção: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Digite o elemento a ser inserido na fila: ");
          char elemento = scanner.next().charAt(0);
          fila.inserirElemento(elemento);
          break;
        case 2:
          fila.consultarElemento();
          break;
        case 3:
          fila.retirarElemento();
          break;
        case 0:
          System.out.println("Encerrando o programa...");
          break;
        default:
          System.out.println("Opção inválida!");
      }
    } while (opcao != 0);

    scanner.close();
  }
}
