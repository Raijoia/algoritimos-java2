package algoritimos.java;
import java.util.Scanner;
import algoritimos.java.TADs.FilaCircularInv;

public class Exercicio18 {
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
          FilaCircularInv.inserirElemento(elemento);
          break;
        case 2:
          FilaCircularInv.consultarElemento();
          break;
        case 3:
          FilaCircularInv.retirarElemento();
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
