// given an array "a" consisting of integers . return the first value that is repeating repeated , otherwise return -1.
package Array_with_java;
import java.util.Scanner;
public class RepeatitionNum {
    static int FirstRepeationNumber(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
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
        System.out.println("first repeatition number of array is:"+FirstRepeationNumber(arr));
    }
}
