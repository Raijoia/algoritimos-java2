package algoritimos.java.TADs;

public class FilaCircularInv {
  public static char[] fila = new char[10];
  public static int tamanho = 0;
  public static int frente = 9;
  public static int tras = 10;

  public static void inserirElemento(char elemento) {
    if (tamanho < fila.length) {
      tras = (tras - 1) % fila.length;
      fila[tras] = elemento;
      tamanho++;
      System.out.println("Elemento inserido com sucesso!");
    } else {
      System.out.println("Fila está cheia. Não é possível inserir mais elementos.");
    }
  }

  public static void consultarElemento() {
    if (tamanho > 0) {
      System.out.println("Primeiro elemento da fila: " + fila[frente]);
      System.out.println("Quantidade de elementos na fila: " + tamanho);
    } else {
      System.out.println("Fila está vazia. Não há elementos para consultar.");
    }
  }

  public static void retirarElemento() {
    if (tamanho > 0) {
      System.out.println("Elemento retirado: " + fila[frente]);
      frente = (frente - 1) % fila.length;
      tamanho--;
    } else {
      System.out.println("Fila está vazia. Não é possível retirar elementos.");
    }
  }
}
