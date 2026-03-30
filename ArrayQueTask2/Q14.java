/*10. Find Duplicate Number
14.	(Easy) Write a Java program to find a duplicate element in an array.
 */
package ArrayQueTask2;

import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate value is: " + arr[i]);
                    return;
                }

            }

        }
        System.out.println("no found dupliate value");

    }

}
