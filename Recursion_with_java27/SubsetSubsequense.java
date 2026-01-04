package Recursion_with_java27;

import java.util.ArrayList;

public class SubsetSubsequense {
    static ArrayList<String> getSSQ(String s) {
        // base case

        ArrayList<String> ans = new ArrayList<>();
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);// a
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;

    }

    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        for (String ss : ans) {
            System.out.println(ss);
        }

    }

}
