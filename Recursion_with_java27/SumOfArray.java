package Recursion_with_java27;

import java.util.Scanner;

public class SumOfArray {
    static int SumArray(int arr[], int idx) {
        if (idx == arr.length) {
            return 0;
        }
        int smallAns = SumArray(arr, idx + 1);
        return smallAns + arr[idx];
    }

    public static void main(RemoveOccurrences[] args) {
        int[] arr = { 2, 1, 3, 4, 5 };
        System.out.println("sum of array:" + SumArray(arr, 0));

    }
}
