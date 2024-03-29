class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int n=nums.length;
        int l=0,r=0;
        int ans=nums[0];
        for(int i=0;i<n;i++){
            l=l==0?1:l;
            r=r==0?1:r;
            l*=nums[i];
            r*=nums[n-1-i];
            ans=Math.max(ans,Math.max(l,r));
        }
        return ans;
    }
}