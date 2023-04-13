from typing import List

class Leetcode121:
    def maxProfit(self, prices: List[int]) -> int:
        min_price = float('inf')
        max_price = 0
        profit = 0
        for price in prices:
            if price < min_price:
                min_price = price
                max_price = min_price
            else:
                max_price = price                
                profit = max(profit, max_price - min_price)
        if profit < 0:
            profit = 0
        return profit