//Count the number of elements greater than value x.
package Array_with_java;

import java.util.Scanner;

public class GreaterOfX {
    // “We traverse the array and count elements that are strictly greater than x.”
    static int StrictlyGreater(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element:" + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value of x:");
        int x = sc.nextInt();
        System.out.println("Greater number of x: " + StrictlyGreater(arr, x));
    }
}
