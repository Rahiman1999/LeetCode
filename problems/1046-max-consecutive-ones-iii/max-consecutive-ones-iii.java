class Solution {
    public int longestOnes(int[] nums, int k) {
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                qu.add(i+1);
            }
        }
        int max = 0,count0=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            maxi++;
            if(nums[i]==0){
                count0++;
            }
            if(count0>k){
                maxi=(i+1)-qu.remove();
                count0--;
            }
            max = Math.max(max,maxi);
        }
        return max;
    }
}