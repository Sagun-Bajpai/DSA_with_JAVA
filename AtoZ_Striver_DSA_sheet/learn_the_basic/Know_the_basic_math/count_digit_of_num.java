package AtoZ_Striver_DSA_sheet.learn_the_basic.Know_the_basic_math;

public class count_digit_of_num {
    public static void count(int n) {
        int count = 0;
        while (n > 0) {
            int rim = n % 10;
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = 12345;

        count(n);

    }

}
