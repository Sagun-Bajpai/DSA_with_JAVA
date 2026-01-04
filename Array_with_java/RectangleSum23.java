package Array_with_java;
import java.util.Scanner;
public class RectangleSum23 {
    static int findSum(int [][]matrix,int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rowes and column of matrix Array:");
        int R=sc.nextInt();
        int C=sc.nextInt();
        int [][]matrix=new int[R][C];
        System.out.println("enter matrix value");
         for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                matrix[i][j]=sc.nextInt();
            }
           
        }
        System.out.println("enter rectangle boundaries l1,r1,l2,r2");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
         
         System.out.println("Rectangle Sum "+  findSum(matrix,l1, l2,r1,r2));
        

    }

    
}
