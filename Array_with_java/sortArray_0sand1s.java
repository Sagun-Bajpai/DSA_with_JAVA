package Array_with_java;
import java.util.Scanner;
public class sortArray_0sand1s {
    static void printArray(int []arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void SortZeroesAndOnes(int[]arr){
        int n=arr.length;
        int zeroes=0;
        // count the number of zeroes
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroes++ ;
            }
        }
         // 0 to zeroes-1,,zeroes to n-1
        for(int i=0;i<arr.length;i++){
            if(i < zeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
       
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
        SortZeroesAndOnes(arr);
        System.out.println("Sorted array:");
        printArray(arr);

    }
    
}
