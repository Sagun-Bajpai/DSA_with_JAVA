package AtoZ_Striver_DSA_sheet.Slove_problem_on_array;

public class linear_search {
    public static int linearsearch(int[] arr, int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        // System.out.print(arr[i]);
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 0 };
        int key = 5;
        System.out.println(linearsearch(arr, key));

    }

}
