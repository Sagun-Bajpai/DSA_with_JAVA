import java.util.Scanner;
public class conditional_que {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        if(num%2==0 && num%3==0){
            System.out.println("found ans-" +num);
        }
        else{
            System.out.println("no choise");
        }
    }
}
