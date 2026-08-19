package AtoZ_Striver_DSA_sheet.Slove_problem_on_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class union_of_two_sorted_array {
    public static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }

        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 3, 4, 5 };
        ArrayList<Integer> result = result(arr1, arr2);
        System.out.println(union);

    }

}
