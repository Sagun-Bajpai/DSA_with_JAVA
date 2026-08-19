package AtoZ_Striver_DSA_sheet.Slove_problem_on_array;

public class pair_in_an_array {
    public static void pair(int[] arr) {
        int n = arr.length;
        int totalpair = 0;
        for (int i = 0; i < n - 1; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                totalpair++;

            }
            System.out.println();

        }
        System.out.println("total pair is:" + totalpair);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 0 };
        pair(arr);

    }

}
