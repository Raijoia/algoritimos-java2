package algoritimos.java;

import algoritimos.java.TADs.ArvoreBinaria;

import java.util.Scanner;

public class Exercicio30 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArvoreBinaria arvore = new ArvoreBinaria();

    arvore.preOrdemInserir(scanner);

    System.out.print("Apresentação dos nós da árvore (ordenado): ");
    arvore.imprimirOrdem(arvore.raiz);

    scanner.close();
  }
}
