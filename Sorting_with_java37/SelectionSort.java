package Sorting_with_java37;

public class SelectionSort {
    static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }

            if (minindex != i) {
                int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 2, 5, 6, 7 };
        SelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}
