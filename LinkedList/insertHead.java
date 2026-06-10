package LinkedList;

public class insertHead {
    // user define data type;
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

        public void insertAtHead(int val) {
            Node temp = new Node(val);
            if (Head == null) {
                Head = temp;
                tail = temp;
            } else {
                temp.next = Head;// connect temp.next->Head

            }
            Head = temp;// update Head

        }

        // get any node value
        public int getValue(int idx) {
            Node temp = Head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // delete any index value
        public void delete(int idx) {
            Node temp = Head;
            if (idx == 0) {
                temp = temp.next;
            }

            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;// temp.next ko temp bna rhe
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
    }

    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.insertAtHead(2);
        l1.insertAtHead(4);
        l1.insertAtHead(10);
        l1.insertAtHead(15);
        l1.insertAtHead(20);
        l1.display();
        System.out.println(l1.getValue(2));
        l1.delete(4);
        l1.display();

        l1.delete(0);
        l1.display();

    }
}