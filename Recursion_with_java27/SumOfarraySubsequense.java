//given an array of integer print sums of all subset in it. output sums can be printedbin any order.
//input [2,4,5]  output [0,2,4,5,6,7,9,11]
package Recursion_with_java27;

import java.util.Scanner;

public class SumOfarraySubsequense {
    static void subsetSum(int[] arr, int n, int idx, int sum) {
        if (idx >= n) {
            System.out.println(sum);
            return;
        }
        subsetSum(arr, n, idx + 1, sum + arr[idx]);// include add
        subsetSum(arr, n, idx + 1, sum);// exclude
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5 };
        subsetSum(arr, arr.length, 0, 0);

    }
}
