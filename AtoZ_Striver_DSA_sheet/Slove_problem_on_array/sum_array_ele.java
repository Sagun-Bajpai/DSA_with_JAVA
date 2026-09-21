package AtoZ_Striver_DSA_sheet.Slove_problem_on_array;

public class sum_array_ele {
    public static int sum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        System.out.print(sum(arr));
    }

}
