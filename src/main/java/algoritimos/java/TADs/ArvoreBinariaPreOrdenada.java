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

  public NoBinario buscar(int busca) {
    return buscarRecursivamente(raiz, busca);
  }

  public NoBinario buscarRecursivamente(NoBinario no, int busca) {
    if (no == null){
      System.out.println(busca + " não encontrado na árvore.");
      return raiz;
    }
    else if (no.valor == busca) {
      System.out.println(busca + " encontrado na árvore.");
      return raiz;
    }
    else if (busca < no.valor)
      return buscarRecursivamente(no.esquerda, busca);
    else
      return buscarRecursivamente(no.direita, busca);
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
