package AtoZ_Striver_DSA_sheet.learn_the_basic.pattern;

public class pattern9 {
    public static void pattern(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n - r; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * r - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int r = n; r >= 1; r--) {
            for (int c = 1; c <= n - r; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * r - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n);

    }

}
