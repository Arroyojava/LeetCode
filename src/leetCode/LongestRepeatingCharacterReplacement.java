package leetCode;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "ABAB";
        String t = "AABABBA";


        System.out.println(characterReplacement(s, 2));
        System.out.println(characterReplacement(t, 1));

    }

    private static int characterReplacement(String s, int k) {

        int[] arr = new int[26];
        int ans = 0;
        int max = 0;
        int i = 0;


        for (int j = 0; j < s.length(); j++) {
            arr[s.charAt(j) - 'A']++;
            max = Math.max(max, arr[s.charAt(j) - 'A']);
            if (j - i + 1 - max > k) {
                arr[s.charAt(i) - 'A']--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
