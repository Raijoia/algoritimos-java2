package algoritimos.java;
import java.util.Scanner;
import algoritimos.java.TADs.FilaInt;

public class Exercicio11 {
  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
					int elemento = scanner.nextInt();
					FilaInt.inserirElemento(elemento);
					break;
				case 2:
					FilaInt.consultarElemento();
					break;
				case 3:
					FilaInt.retirarElemento();
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
