class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        printSubset(nums);
        return ans;
    }
    public void printSubset(int[] nums){
        int lengthh = nums.length;
        int count=0;
        for(int i=0;i<(1<<lengthh);i++){
            printElments(nums,i,count);
            count++;
        }
    }
    public void printElments(int[] nums,int n,int count){
        ans.add(new ArrayList<>());
        int j=0;
        while(n>0){
           int last_bit = (n&1);
           if(last_bit==1){
               ans.get(count).add(nums[j]);
           }
           j++;
           n=n>>1;
        }
    }
}