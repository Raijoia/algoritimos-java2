package algoritimos.java.TADs;

public class Fila {
  public static final int TAMANHO_MAXIMO = 10;
  public static char[] fila = new char[TAMANHO_MAXIMO];
  public static int tamanho = 0;
  public static int inicio = 0;
  public static int fim = 0;

  public void inserirElemento(char elemento) {
    if (tamanho < TAMANHO_MAXIMO) {
      fila[fim] = elemento;
      fim = (fim + 1) % TAMANHO_MAXIMO;
      tamanho++;
      System.out.println("Elemento inserido com sucesso!");
    } else {
      System.out.println("A fila está cheia. Não é possível inserir mais elementos.");
    }
  }

  public void consultarElemento() {
    if (tamanho > 0) {
      System.out.println("Primeiro elemento na fila: " + fila[inicio]);
      System.out.println("Quantidade de elementos na fila: " + tamanho);
    } else {
      System.out.println("A fila está vazia. Não há elementos para consultar.");
    }
  }

  public void retirarElemento() {
    if (tamanho > 0) {
      char elementoRetirado = fila[inicio];
      inicio = (inicio + 1) % TAMANHO_MAXIMO;
      tamanho--;
      System.out.println("Elemento retirado: " + elementoRetirado);
    } else {
      System.out.println("A fila está vazia. Não há elementos para retirar.");
    }
  }
}
