package BalancedBinaryTree;

import java.util.*;

public class Main {

    static Node getNode(int data) {
        // Allocate memory
        Node newNode = new Node();

        // put in the data
        newNode.data = data;
        newNode.left = newNode.right = null;
        return newNode;
    }

    // function to construct a BST from
    // its level order traversal
    static Node LevelOrder(Node root, int data) {
        if (root == null) {
            root = getNode(data);
            return root;
        }
        if (data <= root.data) root.left =
                LevelOrder(root.left, data); else root.right =
                LevelOrder(root.right, data);
        return root;
    }

    static Node constructBst(int arr[], int n) {
        if (n == 0) return null;
        Node root = null;

        for (int i = 0; i < n; i++) root = LevelOrder(root, arr[i]);

        return root;
    }

    public static int height(Node root){
        if(root ==  null) return 0;
        int x = height(root.left);
        int y = height(root.right);
        return Math.max(x,y)+1;

    }

    public static boolean isBalanced(Node root) {
        if(root == null) return true;
        int x = height(root.left);
        int y = height(root.right);
        if(Math.abs(x-y)>1)return false;
        return isBalanced(root.left)&& isBalanced(root.right);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tree = new int[n];
        for (int i = 0; i < n; i++) tree[i] = sc.nextInt();
        sc.close();
        Node root = constructBst(tree, n);
        if (isBalanced(root)) System.out.println("true"); else System.out.println(
                "false"
        );
    }
}

class Node {

    int data;
    Node left, right;
}