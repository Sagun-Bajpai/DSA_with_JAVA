package Recursion_with_java27;

public class SumOFDigit {
    static int SOD(int n) {
        // Base case
        if (n >= 0 && n <= 9) {
            return n;
        }

        // Subproblem
        int smallAns = SOD(n / 10);// find D-1 digit only
        // Self work
        int LastDigit = SOD(n % 10);// find last digit only
        int result = smallAns + LastDigit;// both add value the find sumOfDigit
        return result;
    }

    public static void main(RemoveOccurrences[] args) {
        System.out.println("Sum of Digit:" + SOD(1234));
    }
}

// //Subproblem
// return SOD(n/10)+SOD(n%10);
