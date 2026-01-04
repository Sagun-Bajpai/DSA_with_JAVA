package lecture_8_loops_que;
import java.util.Scanner;
public class Sum_of_Digit {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the any number of digit:");
        int N=sc.nextInt();
        int original_num=N;
        int sum=0;
        while(N>0){
            sum=sum+N%10;;
            N=N/10;
        }
        System.out.println("sum of digit num is "+original_num+"="+sum);
    }
}
