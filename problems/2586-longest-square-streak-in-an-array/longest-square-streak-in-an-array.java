class Solution {
    public int longestSquareStreak(int[] nums) {
      Set<Integer> set = new HashSet<>();
      for(int i:nums){
        set.add(i);
      }
      int max = -1;
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++){
        int curr = nums[i];
        int count=0;
        while(set.contains(curr)){
            set.remove(curr);
            curr=curr*curr;
            count++;
        }
        max = Math.max(max,count);
      }

      return max>1?max:-1;
    }
}