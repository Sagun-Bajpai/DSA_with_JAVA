import java.util.Scanner;
public class find_odd_num{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        if(num%2!=0){
            System.out.println("ODD");
        }
        else{
            System.out.println("EVEN");
        }
    }
}