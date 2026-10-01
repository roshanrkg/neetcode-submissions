class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minbuy=0;
        for (int i=0;i<prices.length;i++){   
            if(i==0){
                minbuy=prices[i];
                continue;
            }
            if(prices[i]<minbuy){
                minbuy=prices[i];
                continue;
            }
            int tempprof = prices[i]-minbuy;
            if(tempprof>profit){
                profit=tempprof;
            }
            
        }
        return profit;
    }
}
