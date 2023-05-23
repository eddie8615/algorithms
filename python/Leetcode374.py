class Leetcode374:
    def guessNumber(self, n: int) -> int:
        l = 1
        r = n
        # arbitrary function
        def guess(num):
            return 0
        while l <= r:
            mid = (l + r) // 2
            res = guess(mid)            
            if res == -1:
                r = mid - 1
            elif res == 1:
                l = mid + 1
            else:
                return mid
        return 0
        