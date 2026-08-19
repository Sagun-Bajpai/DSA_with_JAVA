package AtoZ_Striver_DSA_sheet.Learn_imp_sorting_techniques;

import java.util.Arrays;

public class insertion_sort {
    public static void insertion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i <= n - 1; i++) {
            int prev = i - 1;
            int curr = arr[i];
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;

        }
    }

    // print sorted array
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 4, 1 };
        insertion(arr);
        // Arrays.sort(arr);
        print(arr);
        // System.out.println(Arrays.toString(arr));
    }

}
