//count the number of triplet whose sum is equal to the given value x.
package Array_with_java;
import java.util.Scanner;
public class TripletSum {
    static int tripletsum(int[]arr,int target){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){// for first number
            for(int j=i+1;j<n;j++){//for second number
                for(int k=j+1;k<n;k++){//for third number
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;

                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the element :" + n);
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println("target sum:");
        int target=sc.nextInt();
        System.out.println("triplet is:"+tripletsum(arr, target));

    }
}
