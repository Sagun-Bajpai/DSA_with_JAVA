/*B. SEARCHING BASED
11. Linear Search
16.	(Medium) Write a Java program to return the index of the element if found, otherwise return -1.
*/
package ArrayQueTask2;

import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter element:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("enter target:");
        int target = sc.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break;

            }

        }
        System.out.println("index is:" + index);

    }

}
