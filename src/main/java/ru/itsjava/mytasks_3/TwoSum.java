package ru.itsjava.mytasks_3;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{11, 15, 2, 7};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int temp = 0, index1 = 0, index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            index1 = i;
            for (int j = i + 1; j < nums.length; j++) {
                if ((temp + nums[j]) == target) {
                    index2 = j;
                    return new int[]{index1, index2};
                }
            }
        }
        return null;
    }
}
