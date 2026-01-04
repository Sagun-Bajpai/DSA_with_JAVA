package Recursion_with_java27;

public class ArrayvaluePrint {
    static void PrintArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.print(" " + arr[idx]);
        PrintArray(arr, idx + 1);
    }

    public static void main(RemoveOccurrences[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        PrintArray(arr, 0);
    }
}
