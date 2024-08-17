class Solution {
    public int[] resultsArray(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int[] ans = new int[nums.length-k+1];
        Arrays.fill(ans,-1);
        int max=0;
        for(int i=0;i<=nums.length-k;i++){
            boolean f= true;
            for(int j=i;j<i+k-1;j++){
                if(nums[j]!=nums[j+1]-1){
                    f=false;
                    break;
                }
            }
            if(f) ans[i] = nums[i+k-1];
        
        }
        return ans;
        
    }
}