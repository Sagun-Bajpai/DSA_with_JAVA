package Array_with_java;

import java.util.Scanner;

public class sufffixSumOfArray {
        static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static  int[] makePrefixSumOfArray(int[]arr){
        int n=arr.length;
        for(int i=n-1;i<0;i--){
            arr[i]=arr[n-1]+arr[i];
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
