package lecture_8_loops_que;
import java.util.Scanner;
public class a_power_of_b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value odf a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
       
        int ans=1; 
        for (int i=1;i<=b;i++)// b is equal to 5
        {
            ans=ans*a;

        }
        System.out.println("a is the power of b"+"="+ans);

    }
}
