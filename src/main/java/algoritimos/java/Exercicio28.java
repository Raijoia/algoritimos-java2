public class Exercicio28 {
    import java.util.Scanner;

    class Node {
        int data;
        Node prev;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    
    class ListaDuplamenteLigada {
        Node first;
        Node last;
        Node current;
    
        ListaDuplamenteLigada() {
            this.first = null;
            this.last = null;
            this.current = null;
        }
    
        void inicializarLista() {
            current = first;
            System.out.println("Lista Inicializada");
        }
    
        void proximoNo() {
            if (current == null) {
                System.out.println("Lista Encerrada");
            } else if (current == last) {
                System.out.println("Último da Lista: " + current.data);
                current = null;
            } else {
                System.out.println("Próximo Nó: " + current.data);
                current = current.next;
            }
        }
    
        void noAnterior() {
            if (current == null) {
                System.out.println("Lista Encerrada");
            } else if (current == first) {
                System.out.println("Primeiro da Lista: " + current.data);
                current = null;
            } else {
                System.out.println("Nó Anterior: " + current.prev.data);
                current = current.prev;
            }
        }
    
        void inserirNo(int data) {
            Node newNode = new Node(data);
            if (current == null) {
                if (last == null) {
                    first = newNode;
                    last = newNode;
                } else {
                    last.next = newNode;
                    newNode.prev = last;
                    last = newNode;
                }
            } else {
                newNode.prev = current;
                newNode.next = current.next;
                if (current.next != null) {
                    current.next.prev = newNode;
                }
                current.next = newNode;
            }
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
    
            while (true) {
                System.out.println("Escolha uma opção:");
                System.out.println("a) Inicializar Lista");
                System.out.println("b) Próximo Nó");
                System.out.println("c) Nó Anterior");
                System.out.println("d) Inserir Nó");
                System.out.println("e) Sair");
    
                char opcao = scanner.next().charAt(0);
                scanner.nextLine(); // Limpar o buffer após ler o caractere
    
                switch (opcao) {
                    case 'a':
                        lista.inicializarLista();
                        break;
                    case 'b':
                        lista.proximoNo();
                        break;
                    case 'c':
                        lista.noAnterior();
                        break;
                    case 'd':
                        System.out.println("Digite o valor do nó:");
                        int valor = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer após ler o inteiro
                        lista.inserirNo(valor);
                        break;
                    case 'e':
                        System.out.println("Encerrando o programa.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }
     
}
