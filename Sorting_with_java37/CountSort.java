package Sorting_with_java37;

public class CountSort {
    static int find_max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void basicCountSort(int[] arr) {
        int max = find_max(arr);
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    static void display(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 3, 2, 2, 4, 6, 6, 4, 4 };
        System.out.print("Before sorting array:  ");
        display(arr);
        System.out.println();
        System.out.print("After countingSort:  ");
        basicCountSort(arr);
        display(arr);
    }

}
