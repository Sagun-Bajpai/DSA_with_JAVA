package Stack_java;

import java.util.Scanner;
import java.util.Stack;

public class takingIpDromeUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("enter the size of number:");
        int n = sc.nextInt();
        System.out.println("enter the element:");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.print(st);

    }

}
