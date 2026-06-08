package LinkedList;

public class basicLinked {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    // using function displaying the List
    public static void display(Node Head) {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // using recursive fuction for connecting the list
    public static void displayRecursive(Node Head) {
        Node temp = Head;
        if (Head == null)
            return;
        System.out.print(temp.data + " ");
        displayRecursive(temp.next);
    }

    // find lenth of the node
    public static int length(Node Head) {
        int count = 0;
        while (Head != null) {
            count++;
            Head = Head.next;

        }
        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(6);
        Node d = new Node(7);
        Node e = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        // using main function displaying the data
        // Node temp = a;
        // while (temp != null) {// displaying the datanusing while
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        display(a);// because a head hai aur head se all node connect hai
        System.out.println();
        // call it self recursion;
        displayRecursive(a);
        System.out.println();
        System.out.println("length of list: " + length(a));

    }

}
