/*given an integer "a "return the prefix sum/running sum
in the same array without creating a new array. */
package Array_with_java;
import java.util.Scanner;
public class prefixSum {
    static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static  int[] makePrefixSumOfArray(int[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
   
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the size of Array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the element of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        printArray(arr);
        System.out.println("prefix sum of arrays element:");
        int [] pref=makePrefixSumOfArray(arr);
        printArray(pref);
}
}


// other mthod
/*given an integer "a "return the prefix sum/running sum
in the same array creating a new array. */

/*package Array_with_java;

import java.util.Scanner;

public class prefixSum {
    static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static  int[] makePrefixSumOfArray(int[]arr){
        int n=arr.length;
        int [] pref=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
   
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the size of Array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the element of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        printArray(arr);
        System.out.println("prefix sum of arrays element:");
        int [] pref=makePrefixSumOfArray(arr);
        printArray(pref);

}
        */

