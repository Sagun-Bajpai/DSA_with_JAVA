package Array_with_java;
import java.util.Scanner;;
public class transeposeOf2DMat {
    static void printArray(int[][]matrix){
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    static int[][] TnacePoseOfMatrix(int[][] matrix,int R,int C){
        int[][] trance=new int[C][R];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                trance[i][j]=matrix[j][i];
            }
        }
        return trance;
    }
    static void transposeInPlace(int[][] matrix,int R,int C){

        for(int i=0;i<C;i++){
            for(int j=i;j<R;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
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
        
        System.out.println("Original Matrix:");
        printArray(matrix);

        System.out.println("Transpose Of Matrix:");
       // int[][] ans = TnacePoseOfMatrix(matrix, R, C);
       // printArray(ans);
       transposeInPlace(matrix,R,C);
       printArray(matrix);
    }
}

/*package Array_with_java;
import java.util.Scanner;;
public class transeposeOf2DMat {
    static void printArray(int[][]matrix){
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    static int[][] TnacePoseOfMatrix(int[][] matrix,int R,int C){
        int[][] trance=new int[C][R];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                trance[i][j]=matrix[j][i];
            }
        }
        return trance;
    }
    public static void main(String[] args) {
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
        
        System.out.println("Original Matrix:");
        printArray(matrix);

        System.out.println("Transpose Of Matrix:");
        int[][] ans = TnacePoseOfMatrix(matrix, R, C);
        printArray(ans);
    }
}
    */