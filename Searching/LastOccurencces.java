package Searching;

public class LastOccurencces {
    static int LastIdx(int[] arr, int x) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int LO = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                LO = mid;
                left = mid + 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return LO;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 3, 3, 3, 4, 5 };
        int x = 3;
        System.out.println("Last occurencces is:" + LastIdx(arr, x));
    }

}
