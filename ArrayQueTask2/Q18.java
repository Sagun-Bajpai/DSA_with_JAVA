/*18.(Medium) Write a Java program to implement Binary Search recursively. */
package ArrayQueTask2;

import java.util.*;

public class Q18 {

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
        System.out.println("index is:" + result);

    }

    static int binarySearch(int[] arr, int st, int end, int target) {
        if (st > end) {
            return -1;
        }
        int mid = (st + (end - st)) / 2;

        if (arr[mid] == target) {
            return mid;

        } else if (arr[mid] > target) {

            return binarySearch(arr, st, mid - 1, target);

        } else {

            return binarySearch(arr, mid + 1, end, target);

        }

    }

}
