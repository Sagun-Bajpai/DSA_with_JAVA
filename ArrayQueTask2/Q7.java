/*4. Reverse Array
7.	(Medium) Write a Java program to reverse the array in-place using two pointers (without creating a new array).
 */
package ArrayQue;

import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int st = 0;
        int end = n - 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        while (st <= end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}
