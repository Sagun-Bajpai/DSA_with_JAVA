/*11.(Medium) Write a Java program to copy array elements into another array in reverse order. */
package ArrayQueTask2;

import java.util.*;

public class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 0;
        int end = n - 1;
        int[] arr = new int[n];
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            copy[i] = arr[i];
        }
        while (st <= end) {
            int temp = copy[st];
            copy[st] = copy[end];
            copy[end] = temp;
            st++;
            end--;
        }
        System.out.print("Reverce copy array:");
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }

    }
}
