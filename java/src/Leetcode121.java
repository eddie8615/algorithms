public class Leetcode121 {
    public int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE;
        int max = 0;
        int profit = 0;
        for(int price : prices){
            if(price < min){
                min = price;
                max = min;
            }else{
                max = price;
                profit = Math.max(profit, max - min);
            }
        }
        if(profit < 0)
            profit = 0;
        return profit;
    }
}
