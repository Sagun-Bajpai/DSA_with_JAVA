package Queue_java;

import java.util.ArrayDeque;

public class basicSTL {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        // push element in queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        // remove first element from queue
        q.poll();
        System.out.println(q);

        // find size of queue
        System.out.println(q.size());

        // find peek element
        System.out.println(q.element());

        // check queue is empty or not

        System.out.println(q.isEmpty());

    }

}
