from typing import List

class Leetcode643:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        len_nums = len(nums)
        ans_sum = curr = sum(nums[0:k])
        for i in range(k, len_nums):
            curr = curr + nums[i] - nums[i-k]
            ans_sum = max(ans_sum, curr)
        return ans_sum / k