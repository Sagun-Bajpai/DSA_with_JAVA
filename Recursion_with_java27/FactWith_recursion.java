package Recursion_with_java27;

public class FactWith_recursion {

    static int factorial(int n) {
        if (n == 0) {

            return 1;
        }

        int Ans = n * factorial(n - 1);
        return Ans;
    }

    public static void main(RemoveOccurrences[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
