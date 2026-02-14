/*find the first occurrences of a given element x, 
given that mi, given array is sorted. If no occurrences of x is found, then return -1.
TC==O(logn)  SC==O(1) */
package Searching;

public class FirstOccurrencces {
    static int FirstIdx(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int FO = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                FO = mid;
                right = mid - 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return FO;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 3, 5, 5, 5 };
        int x = 5;
        System.out.println("first occurecces is:" + FirstIdx(arr, x));

    }

}
