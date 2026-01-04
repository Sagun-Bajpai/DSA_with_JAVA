package Array_with_java;
import java.util.Scanner;
public class sortedArray {
    static boolean isSortedArray(int[]arr){
        boolean check=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i+1]<arr[i]){
                check=false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the element:"+ n);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println("is sorted:"+ isSortedArray(arr));
    }
}
