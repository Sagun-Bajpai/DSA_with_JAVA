package Stack_java;

import java.util.Stack;

public class InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(4);
        st1.push(57);
        st1.push(12);
        st1.push(36);
        System.out.println(st1);
        Stack<Integer> st2 = new Stack<>();
        int idx = 2;
        int x = 10;
        while (st1.size() > idx) {
            st2.push(st1.pop());

        }
        st1.push(x);
        while (st2.size() > 0) {
            st1.push(st2.pop());
        }

        System.out.println(st1);
    }

}
