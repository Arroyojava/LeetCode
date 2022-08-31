/*
   Given an array of integers nums and an integer target,
   return indices of the two numbers such that they add up to target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.
   You can return the answer in any order.
 */


package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] nums1 = {3, 2, 4};
        int target1 = 6;

        int[] nums2 = {3, 3};
        int target2 = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(num), i};
            }
            map.put(diff, i);
        }
        return null;
    }

//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return (new int[]{i, j});
//                }
//            }
//        }
//        return null;
//    }
}

