package Recursion_with_java27;

import java.util.Scanner;

public class PalindromeNum {
    static String ReverseString(String s, int idx) {
        if (idx == s.length())
            return "";

        String smallAns = ReverseString(s, idx + 1);
        char currChar = s.charAt(idx);
        return smallAns + currChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = ReverseString(s, 0);
        if (rev.equals(s)) {
            System.out.println("%s is palidrome" + s);
        } else {
            System.out.println("%s is not palidrome" + s);
        }

    }
}
