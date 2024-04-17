package algoritimos.java;

import algoritimos.java.TADs.FilaCircular;

import java.util.Scanner;

public class Exercicio16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    FilaCircular filaCircular = new FilaCircular(10);

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
          filaCircular.inserirElemento(elemento);
          break;
        case 2:
          filaCircular.consultarElemento();
          break;
        case 3:
          filaCircular.retirarElemento();
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
