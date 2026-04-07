/*given a string ,the task is to toggle all the characters of the string that 
is to convert upper case to lower case and vice versa.
Input=PhysICS
Output=pHYSics */
package String;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle
        // PHysiCs-> phYSIcS
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            int asci = (int) ch;
            if (asci >= 97)
                flag = false;
            if (flag == true) {
                asci += 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);
            } else {
                asci -= 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }

}
