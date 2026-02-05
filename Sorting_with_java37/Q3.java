//Tumhare paas ek array hota hai jisme sirf 3 values hoti hain:0,1,2
//Duch National flag Algorithm.
package Sorting_with_java37;

public class Q3 {
    static void display(int nums[]) {
        for (int val : nums) {
            System.out.print(val + " ");

        }
        System.out.println();
    }

    static void swap(int nums[], int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    static void sort012(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 1, 2, 0, 0, 1, 1, 2, 2, 0, 2 };
        System.out.print("before sorting algorith=");
        display(nums);
        sort012(nums);
        System.out.print("after sorting algorith=");
        display(nums);

    }

}
