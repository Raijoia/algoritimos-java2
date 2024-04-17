package algoritimos.java;

import algoritimos.java.TADs.Fila;

import java.util.Scanner;

public class Exercicio9 {
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
