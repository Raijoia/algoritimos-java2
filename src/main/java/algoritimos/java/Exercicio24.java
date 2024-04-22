package algoritimos.java;
import java.util.Scanner;


public class Exercicio24 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ListaEncadeada lista = new ListaEncadeada();

    while (true) {
      System.out.println("\nEscolha a operação:");
      System.out.println("1. Inserir um novo elemento");
      System.out.println("2. Remover o último elemento");
      System.out.println("3. Exibir a lista");
      System.out.println("4. Sair");

      int escolha = scanner.nextInt();
      switch (escolha) {
        case 1:
          System.out.println("Digite o elemento a ser inserido:");
          String elementoInserir = scanner.next();
          lista.inserir(elementoInserir);
          break;
        case 2:
          lista.remover();
          break;
        case 3:
          lista.exibir();
          break;
        case 4:
          System.out.println("Programa encerrado.");
          scanner.close();
          return;
        default:
          System.out.println("Escolha inválida. Por favor, tente novamente.");
      }
    }
  }
}
