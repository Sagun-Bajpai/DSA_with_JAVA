/*9. Find Missing Number
12.	(Easy) Write a Java program to find the missing number in an array containing numbers from 1 to N.
Example
[1,2,4,5] → missing = 3
 */
package ArrayQueTask2;

import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int len = n + 1;// increse 1 because missing num is include
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i <= len; i++) {
            xor1 ^= i;
        }
        for (int i = 0; i < n; i++) {
            xor2 ^= arr[i];
        }
        int missing = xor1 ^ xor2;
        System.out.println("missing number is:" + missing);

    }
}
