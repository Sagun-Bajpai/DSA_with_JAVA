
package Stack_java;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("empty stack: " + st);
        System.out.println("size is:" + st.size());

        st.push(3);
        st.push(15);
        st.push(12);

        System.out.println(st.peek());
        System.out.print(st.get(0));

        System.out.println();

        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size is:" + st.size());
    }

}
