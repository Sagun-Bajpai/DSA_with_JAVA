package Recursion_with_java27;

//print the max value of an array
public class MaxArray {
    static int maxInArray(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int smallAns = maxInArray(arr, idx + 1);
        return Math.max(arr[idx], smallAns);
    }

    public static void main(String[] args) {
        int[] arr = { 100, 23, 12, 34, 21 };
        System.out.println(maxInArray(arr, 0));

    }
}
