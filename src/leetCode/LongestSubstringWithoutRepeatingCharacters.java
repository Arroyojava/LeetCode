package leetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String s = "abcabcbb";
        String t = "bbbb";
        String u = "pkwwkew";

        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(t));
        System.out.println(lengthOfLongestSubstring(u));


    }

    private static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int result = 0;
        int leftPointer = 0;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            while (set.contains(s.charAt(rightPointer))) {
                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            set.add(s.charAt(rightPointer));
            result = Math.max(result, rightPointer - leftPointer + 1);
        }

        return result;
    }
}
