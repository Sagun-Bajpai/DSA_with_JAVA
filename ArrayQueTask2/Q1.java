/*1. Find Largest Element
1.	(Easy) Write a Java program to find the largest element in an integer array.
Example: [3,7,2,9,5] → 9.
 */
package ArrayQue;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        // we are using array but i know it is taking extra space
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println(max);

    }

}
