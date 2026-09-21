package LinkedList;

public class findMiddle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node middle(Node head ){
        Node slow=head;
        Node fast=head;
        for
        
    }

    public static void main(String[] args) {
        Node a = new Node(2);// 6 idx
        Node b = new Node(4);// 5 idx
        Node c = new Node(5);// 4 idx
        Node d = new Node(6);// 3 idx
        Node e = new Node(1);// 2 idx
        Node f = new Node(9);// 1 idx
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        // Original: 2 -> 4 -> 5 -> 6 -> 1 -> 0 -> null
        // Reversed: 0 -> 1 -> 6 -> 5 -> 4 -> 2 -> null

    }

}
