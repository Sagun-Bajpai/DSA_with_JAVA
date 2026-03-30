/*12. Binary Search
17.	(Easy) Write a Java program to perform Binary Search on a sorted array.
*/
package ArrayQueTask2;

import java.util.*;

public class Q17 {

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
        System.out.println("target is:");
        int target = sc.nextInt();
        int index = -1;

        while (st <= end) {
            int mid = (st + (end - st)) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;

            } else if (arr[mid] > target) {
                end = mid - 1;

            } else {
                st = mid + 1;

            }

        }
        System.out.println("index is:" + index);

    }

}
