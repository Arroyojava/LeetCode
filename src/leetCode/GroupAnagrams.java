/*
    Problem - Given an integer array nums,
    return true if any value appears at least twice in the array,
    and return false if every element is distinct.
 */

package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(Arrays.toString(strs));
        System.out.println(groupAnagrams(strs));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] hash = new char[26];

            for (char c : s.toCharArray())
                hash[c - 'a']++;

            String key = new String(hash);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());

        return res;
    }
}
