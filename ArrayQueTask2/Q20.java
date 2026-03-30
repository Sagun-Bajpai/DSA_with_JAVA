/*20.	(Medium) Write a Java program to count occurrences using binary search in a sorted array. */
package ArrayQueTask2;

import java.util.*;

public class Q20 {

    static int firstoccurrences(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        int index = -1;
        while (st <= end) {
            int mid = (st + (end - st) / 2);
            if (arr[mid] == target) {
                index = mid;
                end = mid - 1;// left side search

            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return index;
    }

    static int lastoccurrences(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        int index = -1;
        while (st <= end) {
            int mid = (st + (end - st)) / 2;
            if (arr[mid] == target) {
                index = mid;
                st = mid + 1;// right side search

            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return index;
    }

    static int countoccurrences(int[] arr, int target) {
        int first = firstoccurrences(arr, target);
        int last = lastoccurrences(arr, target);

        if (first == -1)
            return 0;
        return last - first + 1;

    }

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
        int count = countoccurrences(arr, target);
        System.out.println("count is:" + count);

    }

}
