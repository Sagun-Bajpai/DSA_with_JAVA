// package Array_with_java;
package Array_with_java;

import java.util.Scanner;

public class Second_max_value {

    static int secondMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = secondMaxValue(arr);
        System.out.println("Second largest element is: " + result);
    }
}
