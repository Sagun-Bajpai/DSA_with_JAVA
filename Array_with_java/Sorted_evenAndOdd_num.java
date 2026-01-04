package Array_with_java;

import java.util.Scanner;

public class Sorted_evenAndOdd_num {
    static void printArray(int []arr){
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }
    static void swap(int[]arr,int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void SortedEvenAnadOdd_num(int []arr){
        int n=arr.length; 
        int left=0,right=n-1;
        while(left<right ){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++ ;
                right-- ;
             }
             if(arr[left]%2==0){
                left++ ;
             }
             if(arr[right]%2==1){
                right-- ;
             }
        }

    }
    public static void main(String[]args){
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
       SortedEvenAnadOdd_num(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
    
}
