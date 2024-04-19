import java.util.Scanner;

class filaCircular {
    private String[] nomes;
    private int tam;
    private int capac;
    private int inicio;
    private int fim;

    public filaCircular(int capacidade) {
        this.capac = capacidade;
        nomes = new String[capacidade];
        tam = 0;
        inicio = 0;
        fim = -1;
    }
    public void colocarNome(String nome) {
        if (tam < capac) {
            fim = (fim + 1) % capac;
            nomes[fim] = nome;
            tam++;
            System.out.println("Nome inserido");
        } else {
            System.out.println("está cheia.");
        }
    }
    public void verNome() {
        if (tam > 0) {
            System.out.println("Primeiro nome na fila " + nomes[inicio]);
            System.out.println("Quantidade de nomes na fila " + tam);
        } else {
            System.out.println("está vazia.");
        }
    }
    public void tirarNome() {
        if (tam > 0) {
            System.out.println("Nome retirado: " + nomes[inicio]);
            inicio = (inicio + 1) % capac;
            tam--;
        } else {
            System.out.println(" está vazia.");
        }
    }
}
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaCircular fila = new FilaCircular(10);
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir Nome");
            System.out.println("2. Consultar Nome");
            System.out.println("3. Retirar Nome");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome a ser inserido");
                    scanner.nextLine(); 
                    String nome = scanner.nextLine();
                    fila.colocarNome(nome);
                    break;
                case 2:
                    fila.verNome();
                    break;
                case 3:
                    fila.tirarNome();
                    break;
                case 4:
                    System.out.println("fechando programa.");
                    break;
                default:
                    System.out.println("Operaçao invalida");
                    break;
            }
        } while (opcao != 4);
        scanner.close();
    }
}
