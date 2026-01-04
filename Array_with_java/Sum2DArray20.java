package Array_with_java;

import java.util.Scanner;

public class Sum2DArray20{
    static void printSumMatrix(int[][]matrix){
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    static void add(int[][]A,int R1,int C1,int[][]B,int R2,int C2)
    {
        if(R1!=R2 || C1!=C2){
            System.out.println("wrong input - aadition not possible");
        }
        int [][] sum=new int[R1][C1];
        for(int i=0;i<R1;i++){//rows
            for( int j=0;j<C1;j++){//coloumn
                sum[i][j]=A[i][j]+B[i][j];


            }

        }
        printSumMatrix(sum);
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
            for(int j=0;j<C2;j++){
                B[i][j]=sc.nextInt();
            }


        }
        System.out.println("Matrix A");
        printSumMatrix(A);
         System.out.println("Matrix B");
         printSumMatrix(B);
         System.out.println("sum of matrices:");
         add(A, R1, C1, B, R2, C2);
    }}  
    


