package algoritimos.java;

import algoritimos.java.TADs.Pilha;

import java.util.Scanner;

public class Exercicio2 {
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
