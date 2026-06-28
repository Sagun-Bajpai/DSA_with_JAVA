package Stack_java;

//import java.util.Stack;
public class ArrayImplementionOfStack {

    public static class Stack {
        int[] arr = new int[50];
        int idx = 0;

        void push(int x) {
            arr[idx] = x;
            idx++;

        }

        int peek() {
            if (idx == 0) {
                System.out.print("stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            if (idx == 0)
                return true;
            else
                return false;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.display();
        st.push(3);
        st.display();
        st.push(4);

        st.display();
        System.out.println("Peek: " + st.peek());
        st.pop();
        st.display();
        System.out.println(st);
    }

}
