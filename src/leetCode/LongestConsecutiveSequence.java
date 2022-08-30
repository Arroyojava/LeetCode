package leetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};
        int[] nums1 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        System.out.println(longestConsecutive(nums));
        System.out.println(longestConsecutive(nums1));

    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int longest = 0;

        for (int n : nums) {
            if (!set.contains(n - 1)) {
                int length = 0;
                while (set.contains(n + length))
                    length += 1;
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
