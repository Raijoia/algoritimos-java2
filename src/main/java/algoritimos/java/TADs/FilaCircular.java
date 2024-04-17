package algoritimos.java.TADs;

public class FilaCircular {
  private char[] fila;
  private int tamanho;
  private int frente;
  private int tras;

  public FilaCircular(int capacidade) {
    fila = new char[capacidade];
    tamanho = 0;
    frente = 0;
    tras = -1;
  }

  public void inserirElemento(char elemento) {
    if (tamanho < fila.length) {
      tras = (tras + 1) % fila.length;
      fila[tras] = elemento;
      tamanho++;
      System.out.println("Elemento inserido com sucesso!");
    } else {
      System.out.println("Fila está cheia. Não é possível inserir mais elementos.");
    }
  }

  public void consultarElemento() {
    if (tamanho > 0) {
      System.out.println("Primeiro elemento da fila: " + fila[frente]);
      System.out.println("Quantidade de elementos na fila: " + tamanho);
    } else {
      System.out.println("Fila está vazia. Não há elementos para consultar.");
    }
  }

  public void retirarElemento() {
    if (tamanho > 0) {
      System.out.println("Elemento retirado: " + fila[frente]);
      frente = (frente + 1) % fila.length;
      tamanho--;
    } else {
      System.out.println("Fila está vazia. Não é possível retirar elementos.");
    }
  }
}
