/*14. First Occurrence of Element
21.	(Easy) Write a Java program to find the first occurrence index of a target element.
 */
package ArrayQueTask2;

import java.util.*;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter element:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("target is:");
        int target = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] == target) {
                index = i;
                break;
            }

        }
        System.out.println("first occurrence index is:" + index);

    }

}
