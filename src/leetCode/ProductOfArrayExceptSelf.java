/*
    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements
    of nums except nums[i]. The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    You must write an algorithm that runs in O(n) time and without using the division operation.
*/

package leetCode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] morNums = {-1, 1, 0, -3, 3};

        System.out.println(Arrays.toString(produceExceptSelf(nums)));
        System.out.println(Arrays.toString(produceExceptSelf(morNums)));
    }

    public static int[] produceExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int pre = 1, post = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = post;
            post *= nums[i];
            System.out.println(post);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= pre;
            pre *= nums[i];
            System.out.println(pre);
        }

        return result;
    }
}
