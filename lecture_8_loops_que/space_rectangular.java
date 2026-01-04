
package lecture_8_loops_que;
import java.util.Scanner;
public class space_rectangular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row :");
        int r=sc.nextInt();//r for row
         System.out.println("enter the coloumn:");
        int c=sc.nextInt();//c for coloumn
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r||j==1||j==c){
                    System.out.print("*");// single line me rkhne ke liye (ln) ka use nhi karenge.

                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();// koi message print nhi krenge toh next line me print hoga.
        }
         
    }
}
