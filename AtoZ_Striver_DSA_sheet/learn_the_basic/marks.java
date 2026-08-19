package AtoZ_Striver_DSA_sheet.learn_the_basic;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks:");
        int marks = sc.nextInt();
        if (marks < 25) {
            System.out.println("GRADE F");
        } else if (marks >= 25 && marks <= 44) {
            System.out.println("GRADE E");

        } else if (marks >= 44 && marks <= 49) {
            System.out.println("GRADE C");

        } else if (marks >= 49 && marks <= 59) {
            System.out.println("GRADE B");

        } else if (marks >= 59 && marks <= 70) {
            System.out.println("GRADE A");

        } else {
            System.out.println("Invalid");
        }

    }

}
