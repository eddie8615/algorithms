class Solution:
    def firstBadVersion(self, n: int) -> int:
        # Just added for removing red lines in the editor
        def isBadVersion(n):
            return True

        fi = 1
        while fi < n:
            mid = (fi + n) // 2
            if isBadVersion(mid):
                n = mid - 1
            else:
                fi = mid + 1
        if isBadVersion(n):
            return n
        else:
            return n + 1