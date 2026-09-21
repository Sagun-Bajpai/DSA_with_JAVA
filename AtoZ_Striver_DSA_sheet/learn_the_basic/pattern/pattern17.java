package AtoZ_Striver_DSA_sheet.learn_the_basic.pattern;

public class pattern17 {
    public static void pattern(char ch) {
        for (char i = ch; i <= ch + 4; i++) {
            for (char j = ch; j <= ch + 4 - (i - ch); j++) {
                System.out.print((char) (j));

            }
            for (char j = ch; j <= ch + 4 - (i - ch); j++) {
                System.out.print((char) (j));

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        char ch = 'A';
        pattern(ch);

    }
}
