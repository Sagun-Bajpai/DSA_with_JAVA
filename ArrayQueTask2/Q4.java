/*
4.	(Medium) Write a Java program to find the smallest element and also print its index position.
*/
package ArrayQue;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int idx = -1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            // using array but array take extra space o(n)
            if (arr[i] < min) {
                min = arr[i];
                idx = i;

            }
        }
        System.out.println("position  is: " + idx);
        System.out.println("minimum value is: " + min);

    }
}
