package Searching;

/**
 * Binary Search Algorithm Implementation
 * 
 * Time Complexity:
 * - Best Case: O(1) - When element is found at middle position
 * - Average Case: O(log n) - Element found after several divisions
 * - Worst Case: O(log n) - Element at end or not present
 * 
 * Space Complexity: O(1) - Only uses constant extra space
 * 
 * Note: Array must be sorted for binary search to work
 */

public class BinarySearch {
    static int Binarysearch(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 8, 9, 10 };
        int target = 8;
        System.out.print("index is:");
        System.out.println(Binarysearch(arr, target));

    }

}
