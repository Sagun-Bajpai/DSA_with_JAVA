/*2. Find Smallest Element
3.	(Easy) Write a Java program to find the smallest element in an array.
 */
package ArrayQue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            // using array but array take extra space o(n)
            ;
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.println("minimum value is: " + min);

    }

}
/*
 * Time: O(n)
 * Space: O(n) ✅
 */
