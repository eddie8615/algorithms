from typing import List

class Leetcode746:
    # naive method (brute force)
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        def climb(cost, index, cost_sum):
            cost_sum += cost[index]
            if index + 1 >= len(cost) or index + 2 >= len(cost):
                return cost_sum
            return min(climb(cost, index + 1, cost_sum), climb(cost, index + 2, cost_sum))

        return min(climb(cost, 0, 0), climb(cost, 1, 0))
    
    def top_down_approach(self, cost: List[int]) -> int:
        minimum_cost = [0] * (len(cost) + 1)

        for i in range(2, len(cost) + 1):
            one_step = minimum_cost[i - 1] + cost[i - 1]
            two_step = minimum_cost[i - 2] + cost[i - 2]
            minimum_cost[i] = min(one_step, two_step)
        return minimum_cost[-1]