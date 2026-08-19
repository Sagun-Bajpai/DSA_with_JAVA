package AtoZ_Striver_DSA_sheet.learn_the_basic.pattern;

public class pattern14 {
    public static void pattern(char ch) {
        for (char r = ch; r <= ch + 4; r++) {
            for (char c = ch; c <= r; c++) {
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
