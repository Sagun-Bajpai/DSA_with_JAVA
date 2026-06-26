package Stack_java;

import java.util.Stack;
import java.util.Scanner;

public class MoveStackInSameorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(4);
        st.push(2);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st);

        Stack<Integer> ct = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            ct.push(x);
            st.pop();
        }
        System.out.println(ct);
    }
}
