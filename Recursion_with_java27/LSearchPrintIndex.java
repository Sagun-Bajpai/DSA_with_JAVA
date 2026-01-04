package Recursion_with_java27;

import java.util.Scanner;

public class LSearchPrintIndex {
    static int Search(int[] arr, int n, int target, int idx) {
        // base case
        if (idx >= n) {
            return -1;
        }
        // self work
        if (arr[idx] == target) {
            System.out.print(" " + idx);
        }
        // recursive work
        return Search(arr, n, target, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 4, 3, 4, 4, 5 };
        System.out.println("total indises which present target value:");
        Search(arr, arr.length, 4, 0);

    }

}
