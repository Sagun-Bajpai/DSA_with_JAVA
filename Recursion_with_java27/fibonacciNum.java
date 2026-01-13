package Recursion_with_java27;

public class fibonacciNum {
    static int fibonacci(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // subproblem
        int prev = fibonacci(n - 1);
        int prev_prev = fibonacci(n - 2);
        // self work
        int result = prev + prev_prev;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}
