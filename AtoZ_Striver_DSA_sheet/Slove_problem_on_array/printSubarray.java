package AtoZ_Striver_DSA_sheet.Slove_problem_on_array;

public class printSubarray {
    public static void printSubarray(int[] arr) {
        int n = arr.length;
        int totalSubarray = 0;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                totalSubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of subarray is: " + totalSubarray);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5 };
        printSubarray(arr);
    }

}
