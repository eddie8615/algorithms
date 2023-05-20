public class Leetcode746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length + 1];

        for(int i = 2; i < minCost.length; i++){
            int min = Math.min(minCost[i - 1] + cost[i - 1], minCost[i - 2] + cost[i - 2]);
            minCost[i] = min;
        }
        return minCost[minCost.length - 1];
    }    
}
