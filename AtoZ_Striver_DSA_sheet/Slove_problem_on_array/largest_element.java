package AtoZ_Striver_DSA_sheet.Slove_problem_on_array;

public class largest_element {
    public static void largest(int[] arr) {
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.print(max);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 0 };
        largest(arr);

    }

}
