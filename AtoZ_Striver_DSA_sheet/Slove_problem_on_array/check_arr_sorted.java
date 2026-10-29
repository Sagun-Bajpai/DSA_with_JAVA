package AtoZ_Striver_DSA_sheet.Slove_problem_on_array;

public class check_arr_sorted {
    public static boolean sorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print(sorted(arr, 5));
    }

}
