package algoritimos.java.TADs;

public class Pilha {
  private static final int TAMANHO_MAXIMO = 10;
  private char[] elementos;
  private int topo;

  public Pilha() {
    elementos = new char[TAMANHO_MAXIMO];
    topo = -1;
  }

  public void inserirElemento(char elemento) {
    if (topo < TAMANHO_MAXIMO - 1) {
      topo++;
      elementos[topo] = elemento;
      System.out.println("Elemento inserido com sucesso.");
    } else {
      System.out.println("A pilha está cheia, não é possível inserir mais elementos.");
    }
  }

  public void consultarElemento() {
    if (topo >= 0) {
      System.out.println("Último elemento inserido: " + elementos[topo]);
      System.out.println("Quantidade de elementos na pilha: " + (topo + 1));
    } else {
      System.out.println("A pilha está vazia.");
    }
  }

  public void retirarElemento() {
    if (topo >= 0) {
      char elemento = elementos[topo];
      topo--;
      System.out.println("Elemento retirado: " + elemento);
    } else {
      System.out.println("A pilha está vazia.");
    }
  }
}
