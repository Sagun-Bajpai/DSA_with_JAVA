package Sorting_with_java37;

public class BubbleSort {
    static void bubblesort(int[] arr, int n) {
        n = arr.length;
        // n-1 iteration for traversing
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                /*
                 * last i element are already at correct shorted position,so no need to check
                 * them
                 */
                if (arr[j] > arr[j + 1]) {
                    // SWAP - ARR[J],ARR[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 7, 1, 9 };
        bubblesort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");

        }

    }

}
