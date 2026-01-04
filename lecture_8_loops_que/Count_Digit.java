package lecture_8_loops_que;
import java.util.Scanner;
public class Count_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the any digit of number:");
        int N=sc.nextInt();
        int numOfDigit=0;
        int original_num=N;
        while(N>0){
            N=N/10;
            numOfDigit++;

        }
        System.out.println("Number of digit in "+original_num+"="+numOfDigit);
        }
}
