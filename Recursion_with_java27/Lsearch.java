package Recursion_with_java27;

import java.util.Scanner;

public class Lsearch {

    static int Search(int[] arr, int n, int target, int idx) {
        // base case
        if (idx >= n) {
            return -1;
        }
        // self work
        if (arr[idx] == target) {
            return idx;
        }
        // recursive work
        return Search(arr, n, target, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 3, 2, 4, 5 };
        System.out.println("idex number is:" + Search(arr, arr.length, 5, 0));

    }
}
