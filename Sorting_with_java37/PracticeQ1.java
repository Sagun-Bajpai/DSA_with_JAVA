//give an  integer array move all 0's to the end of it while maintaing the relative order of the non-Zero element.
package Sorting_with_java37;

public class PracticeQ1 {
    static void Zeroes(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 0, 0, 5, 6, 3 };
        Zeroes(arr);
        for (int val : arr) {
            System.out.print(val + " ");

        }

    }
}