class Leetcode409:
    def longestPalindrome(self, s: str) -> int:
        char_dict = dict()
        for c in s:
            char_dict[c] = char_dict.get(c, 0) + 1
        length = 0        
        for l in char_dict.values():
            length += l // 2 * 2            
            if length % 2 == 0 and l % 2 == 1:
                length += 1 
        
        return length