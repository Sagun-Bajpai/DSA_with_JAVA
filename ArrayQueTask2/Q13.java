/*13.(Medium) Write a Java program to *find the missing number using the sum formula (N(N+1)/2)**. */
package ArrayQueTask2;

import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int len = n + 1;
        int expectedsum = (len * (len + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }
        int missing = expectedsum - actualSum;
        System.out.println("missing number is:" + missing);

    }

}
