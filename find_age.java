import java.util.Scanner;
public class find_age {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age age of any person:");
        int age=sc.nextInt();
        if(age<12){
            System.out.println("this is age of child");
        }
        else if(12 <age && age< 18){
            System.out.println("this is age of teenager");

        }
        else{
            System.out.println("this is age of adult");
        }
    }

}
