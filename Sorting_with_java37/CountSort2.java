package Sorting_with_java37;

public class CountSort2 {
    static void display(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    // find the largest element of the array
    static int find_max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void CountSort(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        int max = find_max(arr);
        // larget number of index
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {// frequency arr
            count[arr[i]]++;
        }
        // make prifix sum of arr of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];

        }
        // find the index element of each array and put the output array
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        // copy all elements of output to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, 2, 5 };
        CountSort(arr);
        display(arr);

    }

}
