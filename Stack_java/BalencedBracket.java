package Stack_java;

import java.util.*;

public class BalencedBracket {

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);// char data type used for single character
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.size() == 0)
                    return false;
                if (st.peek() == '(')
                    st.pop();
            }

        }
        if (st.size() > 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(isBalanced(str));
    }

}
