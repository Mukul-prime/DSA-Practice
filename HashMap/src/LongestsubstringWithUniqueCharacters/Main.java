package LongestsubstringWithUniqueCharacters;

import java.util.*;

class Solution {
    public int longestSubstring(String s) {
        int n = s.length();
        int max = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < n; right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;

            }
            set.add(s.charAt(right));

            max = Math.max(max, right - left + 1);


        }

        return max;
    }
}

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution ob = new Solution();
        int ans = ob.longestSubstring(s);
        System.out.println(ans);
    }
}