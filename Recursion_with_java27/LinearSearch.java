package Recursion_with_java27;

//given an array of n interger and a target value x.print whether x exist in the array or not.
import java.util.Scanner;

public class LinearSearch {
    static boolean Search(int[] arr, int n, int target, int idx) {
        // base case
        if (idx >= n) {
            return false;
        }
        // self work
        if (arr[idx] == target) {
            return true;
        }
        // recursive work
        return Search(arr, n, target, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 3, 2, 4, 5 };
        System.out.println(Search(arr, arr.length, 1, 0));

    }
}
