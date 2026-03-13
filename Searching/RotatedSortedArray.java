package Searching;

/*  rotated sorted array is a sorted array on which rottion operation has been performed some number of times.
 given a sorted array, find the index of the minimum element in the array . Follow 0-based indexing */
public class RotatedSortedArray {
    static int FindRotatedArrayIdx(int[] arr) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int ans = 0;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] > arr[n - 1]) {
                st = mid + 1;
            } else if (arr[mid] <= arr[n - 1]) {
                ans = mid;
                end = mid - 1;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
        int res = FindRotatedArrayIdx(arr);
        System.out.println("index is " + res + " which store minimum value in this array");

    }

}
