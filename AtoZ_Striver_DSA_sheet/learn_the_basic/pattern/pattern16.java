package AtoZ_Striver_DSA_sheet.learn_the_basic.pattern;

public class pattern16 {
    public static void pattern(char ch) {
        for (char r = ch; r <= ch + 4; r++) {
            for (char c = ch; c <= ch + 4 - (r - ch); c++) {
                System.out.print((char) (c));

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        char ch = 'A';
        pattern(ch);

    }

}
