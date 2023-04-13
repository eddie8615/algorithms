import java.util.*;

public class Leetcode409 {
    public int longestPalindrome(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int length = 0;
        for(int l : map.values()){
            length += l / 2 * 2;
            if (length % 2 == 0 && l % 2 == 1)
                length += 1;
            
        }
        return length;
    }
}
