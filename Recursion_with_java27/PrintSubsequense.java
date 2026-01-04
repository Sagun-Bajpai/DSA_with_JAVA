package Recursion_with_java27;

//second method without using arrayList finding subsequense
public class PrintSubsequense {
    static void printSSQ(String s, String currAns) {
        if (s.length() == 0) {
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString, currAns + curr);// add curr
        printSSQ(remString, currAns);// do not addd char
    }

    public static void main(String[] args) {
        printSSQ("abc", "");

    }

}
