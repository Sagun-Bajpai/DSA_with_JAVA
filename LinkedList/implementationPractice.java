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

        // function insertatHead
        public void insertAtHead(int val) {
            Node temp = new Node(val);
            // for empty node
            if (Head == null) {
                Head = temp;
                tail = temp;
            } else {// non empty
                temp.next = Head;
                Head = temp;

            }
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
        l1.insertAtHead(3);
        l1.insertAtHead(4);
        l1.insertAtHead(5);
        l1.insertAtHead(6);
        l1.insertAtHead(1);
        l1.display();

    }

}
