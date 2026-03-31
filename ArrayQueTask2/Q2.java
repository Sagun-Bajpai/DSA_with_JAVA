/*2.(Medium) Write a Java program to find the largest element without sorting the array and using only one loop traversal. */
package ArrayQueTask2;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        // int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            // arr[i] = sc.nextInt();
            // without create array becouse array take extra space o(n)
            int nums = sc.nextInt();
            if (nums > max) {
                max = nums;

            }
        }
        System.out.println("maximum value is: " + max);

    }

}
