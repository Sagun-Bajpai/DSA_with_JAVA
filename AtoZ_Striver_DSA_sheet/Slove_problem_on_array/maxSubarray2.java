package AtoZ_Striver_DSA_sheet.Slove_problem_on_array;

public class maxSubarray2 {
    public static void MaxSubarray(int[] arr) {
        int n = arr.length;
        int currSum = 0;
        int max = Integer.MIN_VALUE;

        int prefix[] = new int[n];
        prefix[0] = arr[0];
        // calculate prefix array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                // currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (start == 0) {
                    currSum = prefix[end];
                } else {
                    currSum = prefix[end] - prefix[start - 1];
                }
                // System.out.print("curr sum is: " + currSum + " ,");
                if (max < currSum) {
                    max = currSum;

                }
            }
            System.out.println();
        }
        System.out.println("maximum sum is:" + max);

    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        MaxSubarray(arr);
    }

}
