package OOPS_with_JAVA;

public class fraction {
    public static class Fraction {
        int num;
        int den;

        public Fraction(int num, int den) {
            this.num = num;
            this.den = den;
            simplify();
        }

        public Fraction add(Fraction other) {
            int numerator = this.num * other.den + other.num * this.den;
            int denominator = this.den * other.den;

            Fraction f3 = new Fraction(numerator, denominator);
            return f3;
        }

        public void simplify() {
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }

        // GCD find करने का method ✅
        public int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 7);
        System.out.println(f1.num + "/" + f1.den);

        Fraction f2 = new Fraction(14, 70);
        f2.simplify();
        System.out.println(f2.num + "/" + f2.den);

        Fraction f3 = f1.add(f2);
        System.out.println(f3.num + "/" + f3.den);

    }

}
