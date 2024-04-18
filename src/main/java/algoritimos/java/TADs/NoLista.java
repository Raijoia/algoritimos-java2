package algoritimos.java.TADs;

public class NoLista {
  int item;
  NoLista anterior;
  NoLista proximo;

  public NoLista(int item) {
    this.item = item;
    this.anterior = null;
    this.proximo = null;
  }
}
