package Sorting_with_java37;

public class RadixSort {

    static void display(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    static int find_max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void CountSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int max = find_max(arr);
        // larget number of index
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {// frequency arr
            count[(arr[i] / place) % 10]++;
        }
        // make prifix sum of arr of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];

        }
        // find the index element of each array and put the output array
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }
        // copy all elements of output to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }

    static void radixSort(int[] arr) {
        int max = find_max(arr);// get maximum element
        // apply countign sort to sort elements based on place value
        for (int place = 1; max / place > 0; place *= 10) {
            CountSort(arr, place);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 43, 453, 636, 894, 0, 3 };
        radixSort(arr);
        display(arr);

    }

}
