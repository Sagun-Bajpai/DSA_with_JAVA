/*given the rotated sorted array of integer. which contains distinct elements and an integer target,return the index of target . if it is in the
arr .otherwise return -1 */
package Searching;

public class RSortedArrayFindIdx {
    static int FindIdx(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                if (target > arr[mid] && target <= arr[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target >= arr[st] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int target = 7;
        System.out.println("index is:" + FindIdx(arr, target));

    }

}