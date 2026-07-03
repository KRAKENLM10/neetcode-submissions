class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int profit = 0;
        int b = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>b){
                profit=Math.max(profit, prices[i]-b);
            }
            b=Math.min(b,prices[i]);
        }
        return profit;
    }
}
