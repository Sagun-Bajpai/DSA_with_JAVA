/*24.	(Medium) Write a Java program to find the last occurrence using binary search. */
package ArrayQueTask2;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter element:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("target is:");
        int target = sc.nextInt();
        int result = binarySearch(arr, 0, n - 1, target);
        System.out.println(" last index is:" + result);

    }

    static int binarySearch(int[] arr, int st, int end, int target) {
        int index = -1;
        if (st > end) {
            return -1;
        }
        int mid = (st + (end - st) / 2);

        if (arr[mid] == target) {
            // last index ke liye right side search krte hro
            int right = binarySearch(arr, mid + 1, end, target);
            if (right != -1) {
                return right;
            }

            return mid;

        } else if (arr[mid] > target) {

            return binarySearch(arr, st, mid - 1, target);

        } else {

            return binarySearch(arr, mid + 1, end, target);

        }

    }

}
