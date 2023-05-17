class Leetcode1456:

    # Naive solution
    def maxVowels(self, s: str, k: int) -> int:
        vowels = ['a', 'e', 'i', 'o', 'u']
        max_num = 0
        for i in range(k, len(s) + 1):
            substring = s[i-k:i]
            num = 0            
            for c in substring:
                if c in vowels:
                    num += 1
            max_num = max(max_num, num)

        return max_num
    
    # Optimised solution
    def maxVowels2(self, s: str, k: int) -> int:
        vowels = ['a', 'e', 'i', 'o', 'u']
        max_num = 0
        substring = s[:k]
        for c in substring:
            if c in vowels:
                max_num += 1
        curr = max_num
        for i in range(k,  len(s)):            
            if s[i - k] in vowels:                   
                curr -= 1
            if s[i] in vowels:                
                curr += 1
            # print(str(i) + 'index and ' + str(curr))
            max_num = max(curr, max_num)

        return max_num