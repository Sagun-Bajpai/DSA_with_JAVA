package Stack_java;

import java.util.Stack;

public class pushAtBottom {

    public static void PushBottom(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        PushBottom(st, x);
        st.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        PushBottom(st, 10);
        System.out.println(st);

    }

}
