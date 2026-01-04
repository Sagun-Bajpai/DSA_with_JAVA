package Recursion_with_java27;

import java.util.ArrayList;

public class LSearchfndList {
    static ArrayList<Integer> AllIndises(int[] arr, int n, int target, int idx) {
        // base case
        if (idx >= n) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        // self work
        if (arr[idx] == target) {
            ans.add(idx);
        }
        // recursive work
        ArrayList<Integer> smallAns = AllIndises(arr, n, target, idx + 1);
        ans.addAll(smallAns);
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 4 };
        ArrayList<Integer> ans = AllIndises(arr, arr.length, 1, 0);
        System.out.print(ans);
    }
}
