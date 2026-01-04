import java.util.Scanner;

public class multipleNum {

    static int printMultipleNum(int n, int q) {
        // base case
        if (q == 1) {
            System.out.print(n);
            return n;
        }
        printMultipleNum(n, q - 1);
        System.out.println(n * q);
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        printMultipleNum(n, q);

    }
}
