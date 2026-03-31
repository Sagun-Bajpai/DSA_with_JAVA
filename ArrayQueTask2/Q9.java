/*9.(Medium) Write a Java program to check if an array is sorted either in ascending or descending order.? */
package ArrayQueTask2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        boolean isAcending = true;
        boolean isDecending = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                isAcending = false;
                break;

            } else if (arr[i + 1] < arr[i]) {
                isDecending = false;
                break;

            }

        }
        if (isAcending) {
            System.out.println("Array is sorted in Accending");
        } else if (isDecending) {
            System.out.println("Array is sorted in Decending");

        } else {
            System.out.println("Array is not sorted");
        }

    }

}
