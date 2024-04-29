package algoritimos.java;
import java.util.Scanner;

public class Exercicio32 {
    

    class Node {
        int data;
        Node left;
        Node right;
    
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    class BinaryTree {
        Node root;
    
        BinaryTree() {
            this.root = null;
        }
    
        void insert(int data) {
            root = insertRec(root, data);
        }
    
        private Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
    
            if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }
    
            return root;
        }
    
        void postOrderTraversal(Node node) {
            if (node != null) {
                postOrderTraversal(node.left);
                postOrderTraversal(node.right);
                System.out.print(node.data + " ");
            }
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            BinaryTree tree = new BinaryTree();
    
            System.out.println("Digite os valores para os nós da árvore (digite um valor negativo para parar):");
            while (true) {
                int valor = scanner.nextInt();
                if (valor < 0) {
                    break;
                }
                tree.insert(valor);
            }
    
            System.out.print("Digitação dos nós da árvore (pré-ordenado): ");
            tree.postOrderTraversal(tree.root);
    
            System.out.println("\nApresentação dos nós da árvore (pós-ordenado): ");
            tree.postOrderTraversal(tree.root);
    
            scanner.close();
        }
    }
     
}
