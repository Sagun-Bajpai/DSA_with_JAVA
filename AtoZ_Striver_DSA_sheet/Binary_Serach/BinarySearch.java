package AtoZ_Striver_DSA_sheet.Binary_Serach;

public class BinarySearch {
    public static int binary(int[] arr, int key) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        // invalid index
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int key = 3;
        System.out.print(" index is :" + binary(arr, 3));

    }

}
