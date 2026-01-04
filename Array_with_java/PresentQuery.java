package Array_with_java;
import java.util.Scanner;
public class PresentQuery {
    static int[] makeFrequencyArray(int[]arr){
        int[]freq=new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++ ;
        }
        return freq;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the element "+n);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

       
        System.out.println("enter number of quearies");
        int Q=sc.nextInt();
        int[] freq=makeFrequencyArray(arr);
        while(Q>0){
           System.out.print("enter number to be searched ");
            int x=sc.nextInt();
            if(freq[x]>0){
                 System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            Q-- ;

        }


    }
}
