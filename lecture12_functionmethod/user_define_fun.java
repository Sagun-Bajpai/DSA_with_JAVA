// user definr method
package lecture12_functionmethod;
import java.util.Scanner;
class Algebra{
    int add( int a,int b){
        int ans=a+b;
        return ans;
    }
}


public class user_define_fun {
    public static void main(String[]args){
        Algebra obj=new Algebra();
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum of input number is:");
        int sum=obj.add(a,b);
        System.out.println(sum);


    }
}
