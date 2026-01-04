// find the unique is a given Array whwre all   the element are being repeated twice with one value being unique.
/*ont possitive element in array */
package Array_with_java;
import java.util.Scanner;
public class FindUniqueNum {
    static int findUnique(int []arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        //this is a main code
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
            
        }
        return ans;
       
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the element :" + n);
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println("Unique element is:" + findUnique(arr));
    }
}
