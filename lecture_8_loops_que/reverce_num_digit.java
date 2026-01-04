package lecture_8_loops_que;
import java.util.Scanner;
public class reverce_num_digit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int original_num=N;
        int reverse_num=0;
        while(N>0){
            reverse_num =reverse_num*10+N%10;
            N=N/10;

        }
        System.out.println("reverse number is "+original_num+"="+reverse_num);
    }
}
