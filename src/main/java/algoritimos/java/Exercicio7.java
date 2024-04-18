import java.util.Scanner;

class Pilha {
    private String[] nomes;
    private int topo;

    public Pilha(int capacidade) {
        nomes = new String[capacidade];
        topo = -1;
    }
    public boolean estaVazia() {
        return topo == -1;
    }
    public boolean estaCheia() {
        return topo == nomes.length - 1;
    }
    public void inserir(String nome) {
        if (estaCheia()) {
            System.out.println("A pilha está cheia.");
            return;
        }
        topo++;
        nomes[topo] = nome;
        System.out.println("Nome inserido com sucesso.");
    }
    public String consultar() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia.");
            return null;
        }
        return nomes[topo];
    }
    public String retirar() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia.");
            return null;
        }
        String nome = nomes[topo];
        topo--;
        System.out.println("Nome retirado: " + nome);
        return nome;
    }
    public int tamanho() {
        return topo + 1;
    }
}
public class Exercicio7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Pilha pilha = new Pilha(10);
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
                        scanner.nextLine(); // Consumir quebra de linha pendente
                        System.out.print("Digite o nome a ser inserido: ");
                        String nome = scanner.nextLine();
                        pilha.inserir(nome);
                        break;
                    case 2:
                        String nomeConsultado = pilha.consultar();
                        if (nomeConsultado != null) {
                            System.out.println("Último nome inserido: " + nomeConsultado);
                            System.out.println("Quantidade de nomes na pilha: " + pilha.tamanho());
                        }
                        break;
                    case 3:
                        pilha.retirar();
                        break;
                    case 4:
                        System.out.println("Encerrando o programa.");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } while (opcao != 4);
        }
    }
}
