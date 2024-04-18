package algoritimos.java.TADs;

public class ArvoreBinariaPreOrdenada {
  public NoBinario raiz;

  public ArvoreBinariaPreOrdenada() {
    raiz = null;
  }

  public void inserir(int valor) {
    raiz = inserirRecursivamente(raiz, valor);
  }

  public NoBinario inserirRecursivamente(NoBinario raiz, int valor) {
    if (raiz == null) {
      raiz = new NoBinario(valor);
      return raiz;
    }

    if (valor < raiz.valor)
      raiz.esquerda = inserirRecursivamente(raiz.esquerda, valor);
    else if (valor > raiz.valor)
      raiz.direita = inserirRecursivamente(raiz.direita, valor);

    return raiz;
  }

  public void preOrdem(NoBinario no) {
    if (no != null) {
      System.out.print(no.valor + " ");
      preOrdem(no.esquerda);
      preOrdem(no.direita);
    }
  }

  public void preOrdem() {
    preOrdem(raiz);
  }

  public void posOrdem(NoBinario no) {
    if (no != null) {
      posOrdem(no.esquerda);
      posOrdem(no.direita);
      System.out.print(no.valor + " ");
    }
  }

  public void posOrdem() {
    posOrdem(raiz);
  }
}
