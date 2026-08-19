package AtoZ_Striver_DSA_sheet.learn_the_basic.Know_the_basic_math;

public class reverse_a_num {
    public static void reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int rim = n % 10;
            rev = rev * 10 + rim;
            n = n / 10;

        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        int n = 12345;

        reverse(n);

    }

}
