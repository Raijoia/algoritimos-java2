package algoritimos.java;

import algoritimos.java.TADs.ArvoreBinariaPreOrdenada;

import java.util.Scanner;

public class Exercicio31 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArvoreBinariaPreOrdenada arvore = new ArvoreBinariaPreOrdenada();

    System.out.println("Digite os valores para os nós da árvore (digite -1 para parar): ");
    int valor;
    while ((valor = scanner.nextInt()) != -1) {
      arvore.inserir(valor);
    }

    System.out.print("Digitação dos nós da árvore (pré-ordenado): ");
    arvore.preOrdem();
    System.out.println();

    System.out.print("Apresentação dos nós da árvore (pós-ordenado): ");
    arvore.posOrdem();
    System.out.println();

    scanner.close();
  }
}
