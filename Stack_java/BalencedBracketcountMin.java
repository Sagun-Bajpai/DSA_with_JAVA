package Stack_java;

import java.util.*;

public class BalencedBracketcountMin {

    public static int isBalancedBracket(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int remove = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);

            } else {
                if (st.size() == 0) {
                    remove++;

                } else {
                    st.pop();

                }
            }
        }
        return remove + st.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character:");
        String str = sc.nextLine();
        int ans = isBalancedBracket(str);
        System.out.println(ans);

    }

}
