package Recursion_with_java27;

import java.util.Scanner;

public class SeriesSum {
    static int SumNaturalNum(int n) {
        if (n == 0) {// base case
            return 0;
        }
        if (n % 2 == 0) {
            return SumNaturalNum(n - 1) - n;// recursive and self work
        } else {
            return SumNaturalNum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sum of n natural num ulternate form:");
        System.out.println(SumNaturalNum(n));

    }
}
