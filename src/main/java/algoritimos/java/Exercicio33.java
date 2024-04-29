package algoritimos.java;
import java.util.Scanner;

public class Exercicio33 {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
   

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

    void printPostOrder(Node node, int spaces) {
        if (node == null) {
            return;
        }

        spaces += 5;

        printPostOrder(node.right, spaces);

        System.out.println();
        for (int i = 5; i < spaces; i++) {
            System.out.print(" ");
        }
        System.out.println(node.data);

        printPostOrder(node.left, spaces);
    }
}



}
