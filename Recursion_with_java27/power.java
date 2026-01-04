package Recursion_with_java27;

public class power {
    static int POW(int p, int q) {
        // base case
        if (q == 0) {
            return 1;
        }
        // int smallAns=POW(p,q-1);//this is small problem
        // int Ans=smallAns*p;
        // return Ans;
        return POW(p, q - 1) * p;
    }

    public static void main(String[] args) {
        System.out.println("p to the power of q is:" + POW(5, 4));
    }

}
