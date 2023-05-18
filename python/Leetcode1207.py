from typing import List

class Leetcode1207:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        map = {}
        for num in arr:
            if num in map.keys():
                map[num] = map[num] + 1
            else:
                map[num] = 1
        l = len(map.values())
        set_len = len(set(map.values()))        
        if set_len == l:
            return True
        else:
            return False
