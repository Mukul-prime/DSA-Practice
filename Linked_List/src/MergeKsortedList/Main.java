package MergeKsortedList;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner; // Added import for Scanner

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    LinkedList() {
        head = null;
        tail = null;
    }

    void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
}

public class Main {
    public static Node kSortedlist(List<Node> lists) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(Node node : lists){
            Node head = node;
            Node curr = head;
            while(curr != null){
                arr.add(curr.data);
                curr = curr.next;
            }
        }

        Collections.sort(arr);
        Node Dummy = new Node(-1);
        Node tail =Dummy ;
        for(int a : arr){
           Node nodes = new Node(a);
           tail.next = nodes;
           tail=tail.next;

        }

        return Dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        List<Node> lists = new ArrayList<>();

        while (k-- > 0) {
            int n = sc.nextInt();
            LinkedList l = new LinkedList();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                Node temp = new Node(x);
                l.addToTheLast(temp);
            }

            lists.add(l.head);
        }

        Node ans = kSortedlist(lists);

        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }

        System.out.println();
    }
}
