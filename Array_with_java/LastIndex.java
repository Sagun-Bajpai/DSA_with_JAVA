//find the last occurrences of an element x in a given array
/*“Main poora array left se right dekhunga,
jab-jab x milega, index update karta jaunga.
End me jo index bachega, wahi last occurrence hoga.” */
package Array_with_java;

import java.util.Scanner;

public class LastIndex {
    static int LastOccurrences(int[] arr, int x) {
        int LastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                LastIndex = i;
            }
        }
        return LastIndex;
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
        System.out.println("last occurrences of x: " + LastOccurrences(arr, x));
    }
}
