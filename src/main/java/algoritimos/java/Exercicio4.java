package algoritimos.java;
import java.util.Scanner;
import algoritimos.java.TADs.PilhaInt;

public class Exercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PilhaInt pilha = new PilhaInt();
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
          int elemento = scanner.nextInt();
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
