package algoritimos.java.TADs;

public class ListaEncadeadaString {
  private NoString inicio;
  private NoString fim;

  public ListaEncadeadaString() {
    this.inicio = null;
    this.fim = null;
  }

  public void inserir(String elemento) {
    NoString novoNo = new NoString(elemento);
    if (inicio == null) {
      inicio = novoNo;
      fim = novoNo;
    } else {
      fim.proximo = novoNo;
      fim = novoNo;
    }
    System.out.println("Elemento " + elemento + " inserido no final da lista.");
  }

  public void remover() {
    if (inicio == null) {
      System.out.println("A lista está vazia.");
      return;
    }
    NoString anterior = null;
    NoString atual = inicio;
    while (atual.proximo != null) {
      anterior = atual;
      atual = atual.proximo;
    }
    if (anterior == null) {
      inicio = null;
      fim = null;
    } else {
      anterior.proximo = null;
      fim = anterior;
    }
    System.out.println("Último elemento removido da lista.");
  }

  public void exibir() {
    if (inicio == null) {
      System.out.println("A lista está vazia.");
      return;
    }
    NoString atual = inicio;
    System.out.print("Lista: ");
    while (atual != null) {
      System.out.print(atual.elemento + " ");
      atual = atual.proximo;
    }
    System.out.println();
  }
}
