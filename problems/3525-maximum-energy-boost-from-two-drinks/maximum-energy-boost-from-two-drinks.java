class Solution {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        long dp[][] = new long[2][energyDrinkA.length+1];
        long max=0;
        for(int i=1;i<energyDrinkA.length+1;i++){
           dp[0][i] = dp[0][i-1]+(long)energyDrinkA[i-1];
           dp[1][i] = dp[1][i-1]+(long)energyDrinkB[i-1];
           dp[0][i] = Math.max(dp[1][i-1],dp[0][i]);
           dp[1][i] = Math.max(dp[0][i-1],dp[1][i]);
           max= Math.max(dp[0][i],dp[1][i]); 
        }
        return max;
        
    }
}