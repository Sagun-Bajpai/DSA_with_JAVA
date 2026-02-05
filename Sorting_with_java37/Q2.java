package Sorting_with_java37;

public class Q2 {
    static void display(int[] nums) {
        for (int val : nums) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void partition(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left < right) {
            while (nums[left] < 0)
                left++;
            while (nums[right] >= 0)
                right--;
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = { 19, -20, 7, -4, -13, 11, -5, 3 };
        System.out.println("before partition array:");
        display(nums);
        System.out.println("after partition array -ve num left dide and -ve num right side:");
        partition(nums);
        display(nums);

    }

}
