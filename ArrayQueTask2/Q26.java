/*26.	25.	(Easy) Write a Java program to move all zeros to the end of the array while maintaining order of non-zero elements. */
package ArrayQueTask2;

import java.util.*;

public class Q26 {
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

        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[st];
                arr[st] = temp;
                st++;
            }

        }
        System.out.println("after zero exit end maintening order:");
        for (int nums : arr) {
            System.out.print(nums + " ");

        }

    }

}
