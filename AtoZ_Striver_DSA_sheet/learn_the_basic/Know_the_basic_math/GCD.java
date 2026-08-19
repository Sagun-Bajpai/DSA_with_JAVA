package AtoZ_Striver_DSA_sheet.learn_the_basic.Know_the_basic_math;

public class GCD {
    public static void GCD(int a, int b) {

        while (a % b != 0) {
            int rim = a % b;
            a = b;
            b = rim;

        }
        System.out.println(b);

    }

    public static void main(String[] args) {
        int a = 18;
        int b = 12;
        GCD(a, b);

    }

}
