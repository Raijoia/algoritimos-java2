import java.util.Scanner;
class Fila {
    private String[] nomes;
    private int tam;
    private int capacity;
    private int inicio;
    private int fim;
    
    public Fila(int capacidade) {
        this.capacity = capacidade;
        this.nomes = new String[capacidade];
        this.tam = 0;
        this.inicio = 0;
        this.fim = -1;
    }
    public void colocarNome(String nome) {
        if (tam < capacity) {
            fim = (fim + 1) % capacity;
            nomes[fim] = nome;
            tam++;
            System.out.println("Nome inserido");
        } else {
            System.out.println("Fila cheia");
        }
    }
    public void verNome() {
        if (tam > 0) {
            System.out.println("Primeiro nome na fila " + nomes[inicio]);
            System.out.println("Quantidade de nomes na fila " + tam);
        } else {
            System.out.println("Fila vazia");
        }
    }
    public void tirarNome() {
        if (tam > 0) {
            System.out.println("Nome retirado" + nomes[inicio]);
            inicio = (inicio + 1) % capacity;
            tam--;
        } else {
            System.out.println("Fila vazia");
        }
    }
}
    public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila(10);
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir Nome");
            System.out.println("2. Consultar Nome");
            System.out.println("3. Retirar Nome");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome a ser inserido: ");
                    scanner.nextLine();
                    String nomeInserir = scanner.nextLine();
                    fila.colocarNome(nomeInserir);
                    break;
                case 2:
                    fila.verNome();
                    break;
                case 3:
                    fila.tirarNome();
                    break;
                case 4:
                    System.out.println("acabou");
                    break;
                default:
                    System.out.println("invalido");
            }
        } while (opcao != 4);
        scanner.close();
    }
}
