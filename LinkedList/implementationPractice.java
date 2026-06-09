package LinkedList;

public class implementationPractice {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Linkedlist {
        Node Head = null;
        Node tail = null;

        public void insetATEnd(int val) {
            Node temp = new Node(val);
            if (Head == null) {
                Head = temp;
            } else {// non empty
                tail.next = temp;

            }
            tail = temp;
        }

        public void display() {
            Node temp = Head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");

        }

    }

    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.insetATEnd(3);
        l1.insetATEnd(4);
        l1.insetATEnd(5);
        l1.insetATEnd(6);
        l1.insetATEnd(1);
        l1.display();

    }

}
