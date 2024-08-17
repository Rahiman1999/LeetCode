class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
      long ans=0,sum=0;
      HashSet<Integer> hs = new HashSet<>();
      int i=0,j=0,n=nums.length;

      while(i<n-k+1){
        if(j-i==k){
            ans=Math.max(ans,sum);
            sum-=nums[i];
            hs.remove(nums[i++]);
        }
        else if(!hs.contains(nums[j])){
            sum+=nums[j];
            hs.add(nums[j++]);
        }else{
            sum-=nums[i];
            hs.remove(nums[i++]);
        }
      }
      return ans;
    }
}