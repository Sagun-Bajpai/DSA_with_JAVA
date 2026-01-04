//Find the total number of pairs in the array whose sum 
package Array_with_java;
import java.util.Scanner;
public class PairsOfArray {
    static int pairsum(int[]arr,int target){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
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
        System.out.println("enter target sum:");
        int target=sc.nextInt();
        System.out.println(pairsum(arr,target));
        
    }
   
   
}
