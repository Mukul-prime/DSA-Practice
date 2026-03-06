package concept;

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

    //    Add a Node
    void insertDataAtlast(int data) {
        Node p = new Node(data);
        Node curr = head;
        if (curr == null) {
            head = p;

        } else if (curr.next == null) {
            curr.next = p;
            return;
        } else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = p;
        }
    }


//    Delete A Node


    //    Size of Node
    int size(Node head) {
        Node curr = head;
        if (curr == null) {
            return 0;

        }
        if (curr.next == null) {
            return 1;
        } else {
            return 1 + size(curr.next);
        }
    }


//    Traverse Node

    void print() {
        Node curr = head;


        if (curr == null) {
            System.out.println("List is empty");
        }
        if (curr.next == null) {
            System.out.println(curr.data + " -> " + "Null");

        }

        while (curr.next != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }


}


public class conceptmakes {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertDataAtlast(10);
        list.insertDataAtlast(20);
        list.insertDataAtlast(30);
        list.insertDataAtlast(40);
        System.out.println(list.size(list.head));


        list.print();
    }
}
