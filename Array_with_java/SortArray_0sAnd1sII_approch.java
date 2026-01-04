package Array_with_java;
import java.util.Scanner;
public class SortArray_0sAnd1sII_approch {
    static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    static void swap(int[]arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp ;
    }
    static void SortZeroesAndOnes(int[]arr){
        int n=arr.length; // two pointer approach
        int left=0 , right=n-1;
        while(left<right){
        if(arr[left]==1 && arr[right]==0){
            swap(arr,left,right);
            left++ ;
            right-- ;

        }
        if(arr[left]==0){
            left++ ;
        }
        if(arr[right]==1){
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
        SortZeroesAndOnes(arr);
        System.out.println("Sorted array:");
        printArray(arr);

}
}

    