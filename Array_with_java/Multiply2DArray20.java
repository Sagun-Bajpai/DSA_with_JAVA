package Array_with_java;
import java.util.Scanner;

public class Multiply2DArray20 {
    static void printMatrix(int[][]matrix){
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    static void multiply(int[][]A,int R1,int C1,int[][]B,int R2,int C2)
    {
        if(C1!=R2){
            System.out.println("multiplication not posible- wrong dimention");
            return;
        }
        int [][] mul=new int[R1][C2];
        for(int i=0;i<R1;i++){//rows
            for( int j=0;j<C2;j++){//coloumn
                for( int k=0;k<C1;k++)// c1 tk es liye chal rha kyuki k loop c1 ko apply krke out of bonce nhi hoga
                {
                 mul[i][j]+=A[i][k]*B[k][j];
                }
            }

        }
        System.out.println("multiplication of 2 matrices");
        printMatrix(mul);
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rowes and column of matrix Array:");
        int R1=sc.nextInt();
        int C1=sc.nextInt();
        int [][]A=new int[R1][C1];
        System.out.println("enter matrix value");
         for(int i=0;i<R1;i++){
            for(int j=0;j<C1;j++){
                A[i][j]=sc.nextInt();
            }
           
        }
        System.out.println("enter number of rowes and column of matrix Array:");
        int R2=sc.nextInt();
        int C2=sc.nextInt();
        int [][]B=new int[R2][C2];
        System.out.println("enter matrics value");
         for(int i=0;i<R2;i++){
            for(int j=0;j<C1;j++){
                B[i][j]=sc.nextInt();
            }


        }
        System.out.println("Matrix A");
        printMatrix(A);
         System.out.println("Matrix B");
         printMatrix(B);
         System.out.println("multiply of matrix:");
         //add(A, R1, C1, B, R2, C2);
         multiply(A, R1, C1, B, R2, C2);
    }
}  
    


