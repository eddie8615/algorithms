from typing import List

class Leetcode605:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        space = 0
        if len(flowerbed) == 1:
            if flowerbed[0] == 0 or n == 0:
                return True
            else:
                return False
        
        for i in range(len(flowerbed)):
            if flowerbed[i] == 1:
                continue
            if i == 0 and flowerbed[i + 1] == 0:
                space += 1
                flowerbed[i] = 1
            elif i == len(flowerbed) - 1 and flowerbed[i - 1] == 0:
                space += 1
                flowerbed[i] = 1
            elif flowerbed[i - 1] == 0 and flowerbed[i + 1] == 0:
                space += 1
                flowerbed[i] = 1
        if space >= n:
            return True
        else:
            return False