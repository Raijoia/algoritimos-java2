package algoritimos.java.TADs;

import java.util.Scanner;

public class ArvoreBinaria {
  public NoBinario raiz;

  public ArvoreBinaria() {
    raiz = null;
  }

  void inserir(int valor) {
    raiz = inserirRecursivamente(raiz, valor);
  }

  public NoBinario inserirRecursivamente(NoBinario no, int valor) {
    if (no == null) {
      no = new NoBinario(valor);
      return no;
    }

    if (valor < no.valor)
      no.esquerda = inserirRecursivamente(no.esquerda, valor);
    else if (valor > no.valor)
      no.direita = inserirRecursivamente(no.direita, valor);

    return no;
  }

  public void imprimirOrdem(NoBinario no) {
    if (no != null) {
      imprimirOrdem(no.esquerda);
      System.out.print(no.valor + " ");
      imprimirOrdem(no.direita);
    }
  }

  public void preOrdemInserir(Scanner scanner) {
    System.out.print("Digite o número de nós: ");
    int numNos = scanner.nextInt();
    System.out.print("Digite os nós da árvore (pré-ordenado): ");
    for (int i = 0; i < numNos; i++) {
      int valor = scanner.nextInt();
      inserir(valor);
    }
  }
}
