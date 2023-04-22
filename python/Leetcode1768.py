class Leetcode1768:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        merged = ""
        a, b = 0, 0
        while a < len(word1) and b < len(word2):
            if a == b:
                merged += word1[a]
                a += 1
            else:
                merged += word2[b]
                b += 1
        if a < len(word1):
            merged += word1[a:]
        if b < len(word2):
            merged += word2[b:]            
        return merged