package AtoZ_Striver_DSA_sheet.Learn_imp_sorting_techniques;

public class selection_sort {
    public static void selection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int minvalue = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[minvalue] > arr[j]) {
                    minvalue = j;// minvalue ko update
                }

            }

            int temp = arr[minvalue];
            arr[minvalue] = arr[i];
            arr[i] = temp;

        }
    }

    // print sorted array
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 4, 1 };
        selection(arr);
        print(arr);
    }

}
