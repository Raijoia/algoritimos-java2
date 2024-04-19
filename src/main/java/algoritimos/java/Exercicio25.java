import java.util.Scanner;

class No {
    String cont;
    No proximo;

    public No(String conteudo) {
        this.cont = conteudo;
        this.proximo = null;
    }
}
class Lista {
    No primeiro;
    No ultimo;
    No corrente;
    public Lista() {
        this.primeiro = null;
        this.ultimo = null;
        this.corrente = null;
    }
    public void inicioLista() {
        this.corrente = this.primeiro;
        System.out.println("Lista Iniciada");
    }
    public void ProxNo() {
        if (this.corrente == null) {
            System.out.println("fim da lista");
        } else if (this.corrente == this.ultimo) {
            System.out.println(this.corrente.cont);
            System.out.println("Último Nó da Lista");
            this.corrente = null;
        } else {
            System.out.println(this.corrente.cont);
            this.corrente = this.corrente.proximo;
        }
    }
    public void inserirNo(String conteudo) {
        No novoNo = new No(conteudo);
        if (this.primeiro == null) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;
        } else {
            if (this.corrente == null) {
                this.ultimo.proximo = novoNo;
                this.ultimo = novoNo;
            } else {
                novoNo.proximo = this.corrente.proximo;
                this.corrente.proximo = novoNo;
            }
        }
        this.inicioLista();
    }
    public void tirarUltimoNo() {
        if (this.primeiro == null || this.corrente == this.primeiro) {
            System.out.println("sem nó a ser Eliminado");
        } else {
            No anterior = null;
            No atual = this.primeiro;
            while (atual != this.corrente) {
                anterior = atual;
                atual = atual.proximo;
            }
            anterior.proximo = null;
            this.ultimo = anterior;
            System.out.println("Nó Eliminado");
        }
        this.inicioLista();
    }
}

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();

        char opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("a) Inicializar Lista");
            System.out.println("b) Apresentar Próximo Nó");
            System.out.println("c) Inserir Nó");
            System.out.println("d) Eliminar Último Nó");
            System.out.println("e) Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'a':
                    lista.inicioLista();
                    break;
                case 'b':
                    lista.ProxNo();
                    break;
                case 'c':
                    System.out.print("Digite o conteúdo do novo nó: ");
                    String conteudo = scanner.next();
                    lista.inserirNo(conteudo);
                    break;
                case 'd':
                    lista.tirarUltimoNo();
                    break;
                case 'e':
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("inválido");
            }
        } while (opcao != 'e');
        scanner.close();
    }
}
