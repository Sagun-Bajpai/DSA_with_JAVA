package Recursion_with_java27;

public class KeyPadCombination {
    static void combination(String dig, String[] kp, String result) {
        if (dig.length() == 0) {// kp is keypad
            System.out.print(result + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';// 2
        String currChoices = kp[currNum];// abc
        for (int i = 0; i < currChoices.length(); i++) {
            combination(dig.substring(1), kp, result + currChoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        String dig = "56";
        // kp[7]="pqes"
        String[] kp = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "yuv", "wxyz" };
        // 0 1 2 3 4 5 6 7 8 9
        combination(dig, kp, "");

    }
}
