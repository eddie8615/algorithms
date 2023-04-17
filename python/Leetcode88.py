from typing import List

class Leetcode88:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int):
        nums1_cpy = nums1[:m]

        p1 = 0
        p2 = 0
        for p in range(m+n):
            if (p2 >= n) or (p1 < m and nums1_cpy[p1] <= nums2[p2]):
                nums1[p] = nums1_cpy[p1]
                p1 += 1
            else:
                nums1[p] = nums2[p2]
                p2 += 1

    def simple_solution(self, nums1: List[int], m: int, nums2: List[int], n: int):
        for i in range(n):
            nums1[i + m] = nums2[i]

        nums1.sort()