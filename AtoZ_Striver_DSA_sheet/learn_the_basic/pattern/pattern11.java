package AtoZ_Striver_DSA_sheet.learn_the_basic.pattern;

public class pattern11 {
    public static void pattern(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                if ((r+c) % 2 == 1) {
                    System.out.print(0);

                } else if ((r+c) % 2 == 0) {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n);

    }

}
