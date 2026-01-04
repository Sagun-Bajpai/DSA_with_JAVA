/*package Array_with_java;

public class initilization_2D_array20 {
    static void print2DArray(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int[][]arr={{1,2,3},
                    {4,5,6},
                     {7,8,9}
                    };
        print2DArray(arr);

    }
}
    */
    package Array_with_java;
import java.util.Scanner;
public class initilization_2D_array20 {
    static void print2DArray(int[][]arr){
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("enter the number of rows:");
        int c=sc.nextInt();
        System.out.println("enter " + r*c + " element");
        int [][]arr=new int[r][c];
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
           
        }
        System.out.println("print Array:");
        print2DArray(arr);
    }
}



