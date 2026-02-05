// given an array where all its elemets are sorted in increasing order except two swaped element sort it in linear time. assume there are no duplicate in the array/
//a[]=[3,8,6,7,5,9,10]
package Sorting_with_java37;

public class Q1 {
    static void sorted(int[] nums) {
        int n = nums.length;
        int x = -1;
        int y = -1;
        for (int i = 1; i < n; i++) {

            if (nums[i - 1] > nums[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }

        // for swaping of x and y position
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;

    }

    static void display(int[] nums) {
        for (int val : nums) {
            System.out.print(val + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 3, 8, 6, 7, 5, 9, 10 };
        display(nums);
        sorted(nums);

    }
}
