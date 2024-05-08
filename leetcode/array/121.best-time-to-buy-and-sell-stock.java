/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        int posibleProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < buy){
                buy = prices[i];
                sell = 0;
            }else if(prices[i] > sell && prices[i] - buy > posibleProfit){
                sell = prices[i];
                posibleProfit = sell - buy;
            }

            
        }

        return posibleProfit;
    }
}
// @lc code=end

