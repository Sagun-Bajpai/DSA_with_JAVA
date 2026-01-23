package Sorting_with_java37;

public class QuickSort {
    // display method
    static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }

    }

    // swap method
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int count = 0;
        for (int i = st + 1; i <= end; i++) {
            if (pivot > arr[i]) {
                count++;
            }
        }
        int pivotIdx = st + count;
        swap(arr, st, pivotIdx);

        int i = st, j = end;
        // element lesser or equal left of pivot ,greater or equal ->right of pivot
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] >= pivot) {
                j--;
            }
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;

    }

    static void quickSort(int[] arr, int st, int end) {
        // bace case
        if (st >= end)
            return;
        int pi = partition(arr, st, end);// self work
        quickSort(arr, st, pi - 1);// recursive call
        quickSort(arr, pi + 1, end);
    }

    // main method
    public static void main(String[] args) {
        int[] arr = { 3, 43, 4, 1, 72, 6, 3 };
        System.out.print("before sorted array: ");
        display(arr);
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        System.out.print("after sorted array: ");
        display(arr);
    }

}
