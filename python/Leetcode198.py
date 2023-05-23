from typing import List

class Leetcode198:
    def rob(self, nums: List[int]) -> int:
        li = []
        rich = 0
        for i in range(len(nums)):
            if i == 0 or i == 1:
                rich = max(rich, nums[i])
                li.append(nums[i])
                continue
            if i == 2:
                li.append(nums[i] + nums[0])
                rich = max(rich, nums[i] + nums[0])                
                continue
            robbed = max(nums[i] + li[i - 2], nums[i] + li[i - 3])
            li.append(robbed)
            rich = max(rich, robbed)
        return rich
    
    def optimised(self, nums: List[int]) -> int:        
        n = len(nums)
        if n == 1:
            return nums[0]
        if n == 2:
            return max(nums)
        lst = [0]*n
        lst[0] = nums[0]
        lst[1] = max(nums[0], nums[1])
        for i in range(2, n):
            lst[i] = max(lst[i-1], lst[i-2]+nums[i])
        return lst[-1]
            