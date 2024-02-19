package org.example.сoncatenationofArray;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 7, 2};
        printArray(getConcatenation(nums));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }
}
