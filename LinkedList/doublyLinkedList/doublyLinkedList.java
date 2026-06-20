package LinkedList.doublyLinkedList;

public class doublyLinkedList {
    public static class Node {
        int data;
        Node next = null;
        Node prev = null;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void displayReverce(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void display2(Node random) {
        // we move on left side for finding the data
        Node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        // we move on right side for finding the data
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head, int x) {
        Node t = new Node(39);
        t.next = head;
        head.prev = t;
        head = t;
        return head;

    }

    public static Node insertAtTail(Node head, int x) {
        // using loop for iteration
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // add in last;
        Node t = new Node(45);
        temp.next = t;
        t.prev = temp;
        temp = t;
        return head;
    }

    public static Node insertAtAnyPlace(Node head, int idx, int data) {
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        Node r = temp.next;
        Node t = new Node(49);
        temp.next = t;
        t.prev = temp;
        t.next = r;
        r.prev = t;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(1);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        display(a);
        displayReverce(e);
        display2(b);

        Node newHead = insertAtHead(a, 39);
        display(newHead);

        Node newtail = insertAtTail(a, 32);
        display(newtail);

        Node Linkedlist = insertAtAnyPlace(a, 4, 47);
        display(Linkedlist);

    }

}
