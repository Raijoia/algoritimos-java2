package algoritimos.java;
import java.util.Scanner;

public class Exercicio17 {
  public static class FilaCircular {
    public static char[] fila = new char[10];
    public static int tamanho = 0;
    public static int frente = 9;
    public static int tras = 10;

    public static void inserirElemento(char elemento) {
      if (tamanho < fila.length) {
        tras = (tras - 1) % fila.length;
        fila[tras] = elemento;
        tamanho++;
        System.out.println("Elemento inserido com sucesso!");
      } else {
        System.out.println("Fila está cheia. Não é possível inserir mais elementos.");
      }
    }

    public static void consultarElemento() {
      if (tamanho > 0) {
        System.out.println("Primeiro elemento da fila: " + fila[frente]);
        System.out.println("Quantidade de elementos na fila: " + tamanho);
      } else {
        System.out.println("Fila está vazia. Não há elementos para consultar.");
      }
    }

    public static void retirarElemento() {
      if (tamanho > 0) {
        System.out.println("Elemento retirado: " + fila[frente]);
        frente = (frente - 1) % fila.length;
        tamanho--;
      } else {
        System.out.println("Fila está vazia. Não é possível retirar elementos.");
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int opcao;
    char elemento;

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
          elemento = scanner.next().charAt(0);
          FilaCircular.inserirElemento(elemento);
          break;
        case 2:
          FilaCircular.consultarElemento();
          break;
        case 3:
          FilaCircular.retirarElemento();
          break;
        case 4:
          System.out.println("Encerrando o programa...");
          break;
        default:
          System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
      }
    } while (opcao != 4);

    scanner.close();
  }
}
