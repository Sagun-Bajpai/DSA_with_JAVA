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

        public void add(int val) {
            Node temp = new Node(val);
            if (Head == null) {
                Head = temp;
            } else {
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
        l1.add(4);
        l1.add(3);
        l1.add(5);
        l1.display();

        System.out.println(l1.length());
    }

}
