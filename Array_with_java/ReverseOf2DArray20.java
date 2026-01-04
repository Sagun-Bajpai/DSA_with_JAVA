
package Array_with_java;
import java.util.Scanner;
public class ReverseOf2DArray20 {
   static void printMatrix(int[][]Arr){
        
        for(int i=0;i<Arr.length;i++){
            for(int j=0;j<Arr[i].length;j++){
                System.out.print(Arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    static void reverseArray(int[][]arr,int m,int n){
        for(int i=0;i<m;i++){
           int left=0;
           int right=n-1;
           while(left<right){
            int temp=arr[i][left];
            arr[i][left]=arr[i][right];
            arr[i][right]=temp;
            left++;
            right--;

           }
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rowes and column of matrix Array:");
        int R1=sc.nextInt();
        int C1=sc.nextInt();
        int [][]Arr=new int[R1][C1];
        System.out.println("enter matrix value");
         for(int i=0;i<R1;i++){
            for(int j=0;j<C1;j++){
                Arr[i][j]=sc.nextInt();
            }
           
        }
        
       System.out.println("original array:");
       printMatrix(Arr);
      
       reverseArray(Arr, R1, C1);
        System.out.println("array of reverse order each row");
        printMatrix(Arr);

    }
}  
    









