class Leetcode2390:
    def removeStars(self, s: str) -> str:
        stack = []
        for i in range(len(s)):
            if s[i] != '*':
                stack.append(s[i])
            else:
                stack.pop()
        result = ""
        while stack:
            result = stack.pop() + result
        return result