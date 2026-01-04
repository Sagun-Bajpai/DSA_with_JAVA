package lecture_8_loops_que;

import java.util.Scanner;

public class piramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row:");
        int r=sc.nextInt();//r for row
        System.out.println("enter the coloumn:");
        int c=sc.nextInt();//c for coloumn
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                //print spaces r-i
                    System.out.print(" ");// single line me rkhne ke liye (ln) ka use nhi karenge.
                }
            for(int k=1;k<=2*i-1;k++){
                // print star 2*i-1
                System.out.print("*");
            }
            System.out.println();
            }

            
        }
    
}
