package Searching;

public class recBinarySearch {

    static boolean recBinarysearch(int[] arr, int left, int right, int target) {
        if (left > right)
            return false;
        int mid = (left + right) / 2;
        if (arr[mid] == target) {// bacecase
            return true;
        } else if (arr[mid] < target) {// subproblem
            return recBinarysearch(arr, mid + 1, right, target);
        } else {// subproblem
            return recBinarysearch(arr, left, mid - 1, target);

        }

    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 7, 8, 9, 14, 17, 19, 20 };
        int target = 7;
        while (target != 20) {
            // formating of string
            System.out.printf("%d exist in arr: %b \n", target, recBinarysearch(arr, 0, arr.length - 1, target));
            target++;
        }

    }

}
