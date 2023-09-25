package com.basic;
import java.util.*;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int target = 5;
        int[] a = twoSum(arr,target);
        System.out.println(Arrays.toString(a));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0};
    }
}
