import java.util.Scanner;
public class find_simpleInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of principle:");
        float p=sc.nextFloat();


        System.out.println("Enter value of rate:");
        float r=sc.nextFloat();


        System.out.println("Enter value of time:");
        float t=sc.nextFloat();

        float si=(p*r*t)/100;
        System.out.println("princile:"+p);
        System.out.println("rate:"+r);
        System.out.println("time"+t);
        System.out.println("simple interest is :"+si);



    }
}
