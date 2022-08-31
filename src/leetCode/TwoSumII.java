/*
    Problem - Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
    find two numbers such that they add up to a specific target number.
    Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
    Return the indices of the two numbers,
    index1 and index2, added by one as an integer array [index1, index2] of length 2.
    The tests are generated such that there is exactly one solution. You may not use the same element twice.
    Your solution must use only constant extra space.
 */

package leetCode;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] nums1 = {2, 3, 4};
        int target1 = 6;

        int[] nums2 = {-1, 0};
        int target2 = -1;

        System.out.println(Arrays.toString(twoSumII(nums, target)));
        System.out.println(Arrays.toString(twoSumII(nums1, target1)));
        System.out.println(Arrays.toString(twoSumII(nums2, target2)));
    }

    private static int[] twoSumII(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int curSum = nums[l] + nums[r];
            if (curSum > target)
                r--;
            else if (curSum < target)
                l++;
            else
               return new int[]{l + 1, r + 1};
        }
        return null;
    }
}
