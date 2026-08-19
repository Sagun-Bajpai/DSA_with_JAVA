package AtoZ_Striver_DSA_sheet.Slove_problem_on_array;

public class Second_largest_element {
    public static void secondlarge(int[] arr) {
        int n = arr.length;
        int large = -1;
        int secondlarge = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {

                secondlarge = large;
                large = arr[i];
            }

            else if (arr[i] > secondlarge && arr[i] != large) {
                secondlarge = arr[i];
            }
        }
        System.out.print(secondlarge);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3 };
        secondlarge(arr);

    }

}
