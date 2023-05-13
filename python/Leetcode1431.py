from typing import List

class Leetcode1431:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        largest = max(candies)
        result = []
        for i in candies:
            if i + extraCandies >= largest:
                result.append(True)                
            else:
                result.append(False)
        return result