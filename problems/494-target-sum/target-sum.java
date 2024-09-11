class Solution {
    
    int ans2=0;
    public int findTargetSumWays(int[] nums, int target) {
      solve(nums,target,0,nums.length,0);
      return ans2;
    }
    public void solve(int[] nums,int target,int i,int n,int sum){
        if(i==n){
            if(target==sum){
                ans2++;
                
            }
            return;
        }
            solve(nums,target,i+1,n,sum+nums[i]);
            solve(nums,target,i+1,n,sum-nums[i]);
        
    }
}