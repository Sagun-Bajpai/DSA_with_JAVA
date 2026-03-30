/*  8. Copy Array Into Another Array
10.	(Easy) Write a Java program to copy elements of one array into another array.
 */
package ArrayQueTask2;

import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            copy[i] = arr[i];
        }
        System.out.print("copy array:");
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }

    }

}
