package AtoZ_Striver_DSA_sheet.learn_the_basic.StringBasic;
import java.util.*;
public class string {
    public static void main(String[]args){
        char[]arr={'a','b','c','d'};
        String str= "abcd";
        String str2=new String("abcdefgh");
        String name;

        Scanner sc=new Scanner (System.in);
        System.out.print("enter the name:");
        name=sc.next();
        System.out.print("name is:"+name);


        //for next line
        System.out.println();
        String fullname= "Tomy Stark";
        System.out.println("length of fullname: "+fullname.length());


        //concatination
        String firstname="Sagun";
        String lastname="Bajpai";
        String girlname = firstname + " "+ lastname;
        System.out.println(girlname);

        //using charAt()

        System.out.println(girlname.charAt(0));

        for(int i=0;i<girlname.length();i++){
           //print all charecter
            System.out.print(girlname.charAt(i)+" ");

        }


    }
    
}
