/*17. Remove Duplicates from Sorted Array
27.	(Easy) Write a Java program to remove duplicates from a sorted array and return new length.
 */
package ArrayQueTask2;

import java.util.*;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter element:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int st = 0;
        int end = 1;
        // int count = 1;
        while (end < n) {

            if (arr[st] == arr[end]) {
                // count++;
                end++;
            } else {

                st++;
                arr[st] = arr[end];
                end++;
                // count++;
            }

        }
        System.out.println("length is:" + (st + 1));
        for (int i = 0; i <= st; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
