package algoritimos.java;
import java.util.Scanner;

public class Exercicio3 {
  public static int iTam = 10;
  public static int iPilha[] = new int[iTam];
  public static int iPos = 9;

  public static int push(int iC){
    if(iPos == 0) return 0;
    return iPilha[iPos--] = iC;

  }

  public static int pop(){
    if(iPos == 9) return 0;
    return iPilha[++iPos];
  }

  public static int top(){
    return iPilha[iPos+1];
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
      int opcao;
      do{
      System.out.println("\nEscolha uma opção:");
      System.out.println("1 - Inserir elemento");
      System.out.println("2 - Consultar elemento");
      System.out.println("3 - Retirar elemento");
      System.out.println("0 - Sair");
      System.out.print("Opção: ");
      opcao = s.nextInt();

      
      switch (opcao) {
          case 1:
          Scanner scanner = new Scanner(System.in);
          System.out.println("Digite o novo elemento:");
          int iC = scanner.nextInt();
            if(iPos == 0) System.out.println("\nCapacidade máxima atingida!\n");
            Exercicio3.push(iC);
            break;
          case 2:
            if(iPos == 9){System.out.println("\nNão há elementos para consultar\n");
            break;} 
            System.out.println("\n" + Exercicio3.top());
            break;
          case 3:
            if(Exercicio3.pop() == 0) System.out.println("\nNão há elementos para retirar\n");
            break;
          case 0:
            System.out.println("Saindo...");
            break;
          default:
            System.out.println("Opção inválida!");
            s.close();
      }
      } while(opcao != 0);
  }
}
