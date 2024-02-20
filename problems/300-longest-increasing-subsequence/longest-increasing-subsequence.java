class Solution {
    public int lengthOfLIS(int[] A) {
        int dp[] = new int[A.length];
        Arrays.fill(dp,1);
        int longest_subsequence=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<i;j++){
                if(A[i]>A[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            longest_subsequence=Math.max(longest_subsequence,dp[i]);
        }
        return longest_subsequence;
    }
}