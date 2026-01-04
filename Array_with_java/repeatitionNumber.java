package Array_with_java;

import java.util.Scanner;

public class repeatitionNumber {
    static int LastRepeationNumber(int[]arr){
        int n=arr.length;
        for(int i=n-1;i>-1;i--){
            for(int j=i-1;j>-1;j--){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the element of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("last repeatition number of array is:"+LastRepeationNumber(arr));
    }
}
