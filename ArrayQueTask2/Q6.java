/*6.(Medium) Write a Java program to find the second largest element without sorting the array and without using extra space */
package ArrayQueTask2;

import java.util.Arrays;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        // we are using array but i know it is taking extra space
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        // Arrays.sort(arr);
        // secondlargest = arr[n - 2];

        System.out.println(secondlargest);

    }

}
