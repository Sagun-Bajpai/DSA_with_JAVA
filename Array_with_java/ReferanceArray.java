package Array_with_java;
import java.util.Scanner;
public class ReferanceArray {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    //   System.out.println("enter the size of array:");
    //    int n=sc.nextInt();
        int[] arr=new int[5];
        arr[0]=4;
        arr[1]=54;
        arr[2]=40;
        arr[3]=45;
        arr[4]=56;

    //    System.out.println("Enter the "+n+"element");
    //    for(int i=0;i<arr.length;i++){
    //        arr[i]=sc.nextInt();
    //    }
    System.out.println("Original Array:");
        printArray(arr);
        // trying to copy arr to arr_2
        int[]arr_2=arr;
        System.out.println("copied arr_2");
        printArray(arr_2);
         arr_2[0]=0;
        arr_2[1]=100;
        arr_2=arr.clone();
        System.out.println("copied arr_2 after changing arr_2");
        printArray(arr_2);
        
    }
}
