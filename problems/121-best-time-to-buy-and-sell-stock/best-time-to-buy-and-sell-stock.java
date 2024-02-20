class Solution {
    public int maxProfit(int[] prices) {

        int mini=prices[0];
        int maxi=0;
        int dayprofit=0;

        for(int i=0;i<prices.length;i++){
            mini = Math.min(mini,prices[i]);
            dayprofit = prices[i]-mini;
            maxi=Math.max(maxi,dayprofit);
        }

        return maxi;
        
    }
}