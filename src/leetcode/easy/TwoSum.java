package leetcode.easy;

import java.util.HashMap;

/// 1. TwoSum
public class TwoSum {
    // O(n)
    public int[] solution(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (map.containsKey(remaining)) {
                return new int[] {map.get(remaining), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    // O(n2)
    public int[] solutionTwo(int[] nums, int target) {
        int[] outPut = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            for (int j = i + 1; j < nums.length ; j++) {
                int value2 = nums[j];
                if (value + value2 == target) {
                    outPut[0] = value;
                    outPut[1] = value2;
                    return outPut;
                }
            }
        }

        return outPut;
    }
}
