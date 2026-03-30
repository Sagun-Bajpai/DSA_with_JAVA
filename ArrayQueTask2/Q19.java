/*13. Count Occurrences of Element
19.	(Easy) Write a Java program to count how many times a number appears in an array.
 */
package ArrayQueTask2;

import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int count = 0;

        int[] arr = new int[n];
        System.out.println("enter element:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("target is:");
        int target = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] == target) {
                count++;
            }

        }
        System.out.println("count is:" + count);

    }

}
