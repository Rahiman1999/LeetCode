class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        for(int i=0,cnt=1;i<nums.length;i++){
           if(i>0&&nums[i-1]+1==nums[i]){
            ++cnt;
           }else{
            cnt=1;
           }
           if(i+1>=k){
            ans[i-k+1] = cnt>=k?nums[i]:-1;
           }
        }
        return ans;
    }
}