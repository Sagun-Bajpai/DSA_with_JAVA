package LinkedList;

public class removeNthNode {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeNth(Node Head, int idx) {
        Node temp = Head;
        Node slow = temp;
        Node fast = temp;
        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }
        if (fast.next == null) {
            Head = Head.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;

        }
        // return slow;
        slow.next = slow.next.next;
        return Head;

    }

    public static void display(Node Head) {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

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

        display(a);
        Node newHead = removeNth(a, 2);
        display(newHead);

        // Original: 2 -> 4 -> 5 -> 6 -> 1 -> 0 -> null
        // Reversed: 0 -> 1 -> 6 -> 5 -> 4 -> 2 -> null

    }

}
