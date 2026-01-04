// que is= given an integer array"a" sorted in non-decreesing order, return an array of the squares of each number sorted in non-decresing order.
package Array_with_java;

import java.util.Scanner;

public class SortedNon_Decresing_order {
    static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    static void reverse(int[]arr){
        int i=0 ,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static int[] sortSquares(int[] arr){
        int n=arr.length;
        int left=0 ,right=n-1;
        int[] ans=new int[n];
        int k=0;

        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left] * arr[left];
                left++ ;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right-- ;
            }
        }
       reverse(ans);
        return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        // enter the elelment but sorted array
        System.out.println("enter the element of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array:");
        printArray(arr);
        int[] ans =sortSquares(arr);
        System.out.println("sorted array:");
        reverse(ans);
        printArray(ans);
        
        

        
}
}
