/*26.	(Medium) Write a Java program to move zeros to the end using two pointers without creating a new array. */
package ArrayQueTask2;

import java.util.*;

public class Q25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int st = 0;
        int end = n - 1;

        int[] arr = new int[n];
        System.out.println("enter element:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        while (st <= end) {

            if (arr[st] == 0) {
                while (st < end && arr[end] == 0) {
                    end--;
                }
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;

                end--;
                st++;
            } else {
                st++;
            }

        }
        System.out.println("after zero exit end:");
        for (int nums : arr) {
            System.out.print(nums + " ");

        }

    }

}
