package leetCode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        String a = "rat";
        String b = "car";

        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram(a, b));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        s = new String(sArray);

        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        t = new String(tArray);

        return s.equals(t);
    }
}
