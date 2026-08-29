package AtoZ_Striver_DSA_sheet.Slove_problem_on_array;

public class maxSubarray {
    // Bruteforce approach TC=0(n^3)
    public static void MaxSubarray(int[] arr) {
        int n = arr.length;
        int currSum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }
                System.out.print("curr sum is:  " + currSum + " ,");
                if (max < currSum) {
                    max = currSum;

                }
            }
            System.out.println();
        }
        System.out.println("maximum sum is:" + max);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5 };
        MaxSubarray(arr);
    }

}
