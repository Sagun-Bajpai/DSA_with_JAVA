package Stack_java;

import java.util.Stack;

public class DisplayReverseRecursivly {

    public static void RecursiveReverse(Stack<Integer> st1) {
        if (st1.size() == 0)
            return;
        int top = st1.pop();
        System.out.print(top + " ");
        RecursiveReverse(st1);
        st1.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        // System.out.println(st1);
        RecursiveReverse(st1);
        System.out.println();
        System.out.println(st1);

    }

}
