package Recursion_with_java27;

import java.util.Scanner;

public class GCDEuclid {
    static int GCD(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return GCD(y, x % y);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(GCD(x, y));

    }
}
