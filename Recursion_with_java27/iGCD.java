package Recursion_with_java27;

import java.util.Scanner;

public class iGCD {
    static int iterateGCD(int x, int y) {
        // using iteration method for solving GCD problem
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(iterateGCD(x, y));

    }
}
