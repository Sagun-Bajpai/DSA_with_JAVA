package Recursion_with_java27;

import java.util.Scanner;

public class TableOfNumm {
    static void MultipleNum(int n, int k) {
        if (k == 1) {
            System.out.println(n);
            return;
        }
        MultipleNum(n, k - 1);
        System.out.println(n * k);
    }

    public static void main(RemoveOccurrences[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        MultipleNum(n, k);
    }
}
