package Stack_java;

import java.util.*;

public class PracticeinsertTopandBottom {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        Stack<Integer> Nst = new Stack<>();
        int x = 10;
        // // insert at bottom
        // while (st.size() > 0) {
        // Nst.push(st.pop());
        // }
        // st.push(x);
        // while (Nst.size() > 0) {
        // st.push(Nst.pop());
        // }
        // System.out.println(st);

        // insert at top
        // st.push(x);
        // System.out.println(st);

        // insert any index
        int idx = 2;
        while (st.size() > idx) {
            Nst.push(st.pop());
        }
        st.push(x);
        while (Nst.size() > 0) {
            st.push(Nst.pop());
        }
        System.out.println(st);

    }
}
