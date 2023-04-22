class Leetcode283:
    def moveZeroes(self, nums):
        for i in range(len(nums)):
            nonZeroIdx = i
            if nums[i] == 0:
                for j in range(nonZeroIdx, len(nums)):
                    if nums[j] != 0:
                        nonZeroIdx = j
                        break
                nums[i] = nums[nonZeroIdx]
                nums[nonZeroIdx] = 0

    def most_efficient_solution(self, nums):
        nums[:] = [n for n in nums if not n == 0] + [0] * nums.count(0)