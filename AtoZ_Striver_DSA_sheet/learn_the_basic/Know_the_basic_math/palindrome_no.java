package AtoZ_Striver_DSA_sheet.learn_the_basic.Know_the_basic_math;

public class palindrome_no {
    public static void reverse(int n) {
        int rev = 0;
        int original = n;
        while (n > 0) {
            int rim = n % 10;
            rev = rev * 10 + rim;
            n = n / 10;

        }

        if (rev == original) {
            System.out.println("it is palindrome  " + rev);

        } else {
            System.out.println("it is not palindrome");
        }

    }

    public static void main(String[] args) {
        int n = 1221;
        reverse(n);

    }

}
