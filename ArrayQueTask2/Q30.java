/*30.	(Medium) Write a Java program to merge arrays without using extra array space. */
package ArrayQueTask2;

import java.util.Arrays;
import java.util.Scanner;

public class Q30 {
    static int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int k = 0;
        int n = arr1.length;
        int m = arr2.length;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr1[k] = arr1[i];
                k++;
                i++;
            } else {
                arr1[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < n) {
            arr1[k] = arr1[i];
            k++;
            i++;
        }
        while (j < m) {
            arr1[k] = arr2[j];
            k++;
            j++;
        }
        return arr1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array n and m:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("enter element of arr1:");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();

        }

        System.out.println("enter element of arr2:");
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();

        }
        int[] arr = new int[n + m];
        System.out.print(Arrays.toString(merge(arr1, arr2)));

    }

}
