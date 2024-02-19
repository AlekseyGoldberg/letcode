package org.example.buildArrayFromPermutation;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 2, 1, 5, 3, 4};
        printArray(buildArray(nums));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }
}
