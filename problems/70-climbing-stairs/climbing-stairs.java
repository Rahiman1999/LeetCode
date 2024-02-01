class Solution {
    public int climbStairs(int n) {
        long dp[] = new long[n+1];
        return (int)countStairs(n,dp);
    }

    public long countStairs(int n,long[] dp){
        if(n<=1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n] = countStairs(n-1,dp)+countStairs(n-2,dp);
        return dp[n];
    }
}