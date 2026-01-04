package Sorting_with_java37;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] > arr[j - 1]) {
                // swap arr[j],arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 1, 5, 3, };
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
