package Stack_java;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        Stack<Integer> st2 = new Stack<>();
        while (st1.size() > 0) {
            st2.push(st1.pop());
        }
        while (st2.size() > 0) {
            int x = st2.pop();
            // print stack element
            System.out.print(x + " ");
            st1.push(x);
        }
        System.out.println();
        System.out.println(st1);

    }

}
