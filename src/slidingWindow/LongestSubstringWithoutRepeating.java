package slidingWindow;

/*
    Problem link : https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        while (left<s.length() && right<s.length()){
           if(!set.contains(s.charAt(right))){
               set.add(s.charAt(right));
               maxLen = Math.max(maxLen, set.size());
           } else {
               while(set.contains(s.charAt(right))){
                   set.remove(s.charAt(left++));
               }
               set.add(s.charAt(right));
           }
           right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "dvdf";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Result: "+result);
    }
}
