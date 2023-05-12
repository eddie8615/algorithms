from typing import List

class Leetcode724:
    def pivotIndex(self, nums: List[int]) -> int:
        total = sum(nums)
        left = 0
        for pivot in range(0, len(nums)):                     
            if left == total - left - nums[pivot]:
                return pivot
            left = left + nums[pivot]
        return -1