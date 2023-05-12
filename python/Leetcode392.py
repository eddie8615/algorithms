class Leetcode392:
    def isSubsequence(self, s: str, t: str) -> bool:
        curr_idx = 0
        if s == "":
            return True
        for c in t:
            if c == s[curr_idx]:
                curr_idx = curr_idx + 1
                if curr_idx == len(s):
                    return True
        return False