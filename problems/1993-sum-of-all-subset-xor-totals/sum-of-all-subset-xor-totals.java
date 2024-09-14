class Solution {
    int allXor = 0;
    int sum=0;
    public int subsetXORSum(int[] nums) {
        solve(nums,0,nums.length);
        return sum;
    }
    public void solve(int[] nums,int i,int n){
        if(i==n){
            return;
        }
        for(int j=i;j<n;j++){
            allXor^=nums[j];
            sum+=allXor;
            solve(nums,j+1,n);
            allXor^=nums[j];
        }
    }
}