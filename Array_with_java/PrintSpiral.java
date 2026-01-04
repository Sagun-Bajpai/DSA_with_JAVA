package Array_with_java;
import java.util.Scanner;;
public class PrintSpiral {

    static void printMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }


    }
    static void printSpiralOrder(int[][]matrix,int r,int c){
        int topRow=0,bottomRow=r-1,leftcol=0,rightcol=c-1;
        int topElement=0;
        while (topElement<r*c ) {
            //toprow -> leftcol to right col
            for(int j=leftcol;j<=rightcol && topElement<r*c;j++){
                System.out.print(matrix[topRow][j]+" ");
                topElement++;
            }
            topRow++;

            // rightcol-> topRow to bottomrow 
            for(int i=topRow;i<=bottomRow && topElement<r*c;i++){
                System.out.print(matrix[i][rightcol]+" ");
                  topElement++;
            }
            rightcol--;

            //bottomRow ->rightcol  to left col
            for(int j=rightcol;j>=leftcol && topElement<r*c;j--){
                System.out.print(matrix[bottomRow][j]+" ");
                  topElement++;
            }
            bottomRow--;

            // left col-> bottom row to top row
            for(int i=bottomRow;i>=topRow && topElement<r*c;i--){
                System.out.print(matrix[i][leftcol]+" ");
                  topElement++;
            }
            leftcol++;

           
            
        }
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
        System.out.println("Input Matrix");
        printMatrix(matrix);
        System.out.println("Spiral order");
        printSpiralOrder(matrix,R,C);
    }}
