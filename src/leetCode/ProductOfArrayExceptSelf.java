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
