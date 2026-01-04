// write a program to print all natural number from 1 to n
package Recursion_with_java27;

import java.util.Scanner;

public class N_num_print {

    static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);

    }
}
