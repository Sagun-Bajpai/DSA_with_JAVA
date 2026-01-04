// package Sorting_with_java37;

// public class BubbleSortOptimize {
//     static void bubblesort(int arr[]) {
//         int n = arr.length;
//         // n-1 iteration/passes
//         for (int i = 0; i < n - 1; i++) {
//             boolean flag = false;// has any swaping happened
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (flag == false) {
//                     return;// have any swaped happened?
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 5, 9, 8, 4, 6, 1, 2, 3 };
//         bubblesort(arr);
//         for (int i : arr) {
//             System.out.print(i + " ");

//         }

//     }
// }
package Sorting_with_java37;

public class BubbleSortOptimize {

    static void bubblesort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean flag = false; // swap hua ya nahi

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = true;
                }
            }

            // check AFTER inner loop
            if (!flag) {
                break;// agr false hi toh koi swap nhi hua its means array is sorted.
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 9, 8, 4, 6, 1, 2, 3 };
        bubblesort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
