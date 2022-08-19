/*
   Given an integer array nums,
   return true if any value appears at least twice in the array,
   and return false if every element is distinct.
 */

package leetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> hasSet = new HashSet<>();
        for (int num : nums) {
            if (hasSet.contains(num)) {
                return true;
            }
            hasSet.add(num);
        }
        return false;
    }
}
