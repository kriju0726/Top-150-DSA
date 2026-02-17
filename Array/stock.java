//Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?__cf_chl_tk=LQxdEvMtO5ZU2r9yh7qZTL37.KBIw.IiQy9QPSul2g0-1771304701-1.0.1.1-nKttN6PDzfJ0zQ8mUAdXrWHu8jkio3DKyhaVVzMSgOw

/*
Java -- Brute Force
class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;

        for(int i=0; i<prices.length-1; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[j] - prices[i] > ans){
                    ans = prices[j] - prices[i];
                }
            }
        }
        return ans;
    }
}
*/

/*
Java -- Optimal approach
class Solution {
    public int maxProfit(int[] prices) {
        int min_p = Integer.MAX_VALUE;
        int max_p = 0;

        for(int x : prices){
            min_p = Math.min(min_p, x);
            max_p = Math.max(max_p, x-min_p);
        }
        return max_p;
    }
}
*/

/*
C++ -- Optimal approach
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int min_price = INT_MAX;
        int max_profit = 0;

        for(int i=0; i<prices.size(); i++){
            min_price = min(min_price, prices[i]);
            max_profit = max(max_profit, prices[i] - min_price);
        }
        return max_profit;
    }
};
*/


