package Stack_java;

import java.util.Stack;

public class PushAtBottomReverse {

    public static void PushBottomReverse(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        PushBottomReverse(st, x);
        st.push(top);

    }

    public static void Reverse(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        Reverse(st);
        PushBottomReverse(st, top);

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Reverse(st);
        PushBottomReverse(st, 10);
        System.out.println();
        System.out.println(st);

    }

}
