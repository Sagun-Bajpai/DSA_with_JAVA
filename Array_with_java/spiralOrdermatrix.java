package Array_with_java;

import java.util.Scanner;

public class spiralOrdermatrix {
    static void printMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }


    }
    static int[][] generateSpiralMatrix(int n){
        int [][]matrix=new int[n][n];
        int topRow=0,bottomRow=n-1,leftcol=0,rightcol=n-1;
        int current=1;
        while (current<=n*n ) {
            //toprow -> leftcol to right col
            for(int j=leftcol;j<=rightcol && current<=n*n;j++){
                matrix[topRow][j]=current;
                current++;
                
            }
            topRow++;

            // rightcol-> topRow to bottomrow 
            for(int i=topRow;i<=bottomRow && current<=n*n ;i++){
                 matrix[i][rightcol]=current;
                current++;
            }
            rightcol--;

            //bottomRow ->rightcol  to left col
            for(int j=rightcol;j>=leftcol && current<=n*n;j--){
                 matrix[bottomRow][j]=current;
                 current++;
            }
            bottomRow--;

            // left col-> bottom row to top row
            for(int i=bottomRow;i>=topRow && current<=n*n;i--){
                 matrix[i][leftcol]=current;
                 current++;
            }
            leftcol++;

           
            
        }
        return matrix;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr n:");// order of nxn matrix
        int n=sc.nextInt();
        int [][]matrix=generateSpiralMatrix(n);
        printMatrix(matrix);
        
}
}
