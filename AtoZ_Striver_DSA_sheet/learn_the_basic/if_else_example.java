package AtoZ_Striver_DSA_sheet.learn_the_basic;

import java.util.Scanner;

public class if_else_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }
    }

}
