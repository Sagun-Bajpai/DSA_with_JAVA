package LinkedList;

public class implement {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Linkedlist {
        Node Head = null;
        Node tail = null;

        // insert atHead
        public void insertAtHead(int val) {
            Node temp = new Node(val);
            // for empty list
            if (Head == null) {
                Head = temp;
                tail = temp;
            }
            // for non empty list
            else {
                temp.next = Head;

            }
            Head = temp;
        }

        // insert at the end that is singly linked list
        public void intsertAtEnd(int val) {
            Node temp = new Node(val);
            if (Head == null) {
                Head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        public int getAt(int idx) {
            Node temp = Head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        public void delete(int idx) {
            Node temp = Head;
            if (idx == 0) {
                Head = Head.next;
            }
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        public void display() {
            Node temp = Head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public int length() {
            Node temp = this.Head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;

            }
            return count;
        }

    }

    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.intsertAtEnd(4);
        l1.intsertAtEnd(3);
        l1.intsertAtEnd(5);
        l1.display();

        l1.insertAtHead(6);
        l1.insertAtHead(7);
        l1.insertAtHead(8);
        l1.display();

        System.out.println(l1.getAt(3) + " element in index 3");
        // delete index value
        l1.delete(5);
        l1.display();
        l1.delete(0);
        l1.display();

        System.out.println(l1.length() + " size of list");
    }

}
