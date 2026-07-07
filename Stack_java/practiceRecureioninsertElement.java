package Stack_java;

import java.util.*;

public class practiceRecureioninsertElement {
    public static void DisplayRec(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        DisplayRec(st);
        System.out.print(top + " ");
        st.push(top);

    }

    public static void insertBottom(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;

        }

        int top = st.pop();
        insertBottom(st, 10);
        st.push(top);

    }

    // insert top
    public static void insertTop(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            return;

        }
        insertTop(st, 5);
        st.push(x);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.print(st);
        System.out.println();

        DisplayRec(st);
        System.out.println();

        insertBottom(st, 10);
        System.out.print(st);

        insertTop(st, 5);
        System.out.print(st);

    }

}
