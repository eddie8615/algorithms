from typing import List

class Leetcode2215:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        nums1_set = set(nums1)
        nums2_set = set(nums2)

        nums1_ans = []
        nums2_ans = []
        for num in nums1_set:
            if num not in nums2_set:
                nums1_ans.append(num)
        for num in nums2_set:
            if num not in nums1_set:
                nums2_ans.append(num)

        return [nums1_ans, nums2_ans]
    
    def anotherSol(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        nums1 = set(nums1)
        nums2 = set(nums2)

        return [list(nums1 - nums2),list(nums2 - nums1)]