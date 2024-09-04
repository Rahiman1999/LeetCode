class Solution {
    Set<List<Integer>> ans = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        printSubset(nums);
        return new ArrayList<>(ans);
    }
    public void printSubset(int[] nums){
        int n = nums.length;
        int count = 0;
        for(int i=0;i<(1<<n);i++){
            printElement(nums,i,count);
            count++;
        }
    }
    public void printElement(int[] nums,int n,int index){
        List<Integer> ans1 = new ArrayList<>();
        int j=0;
        while(n>0){
            int last_bit = (n&1);
            if(last_bit==1){
                ans1.add(nums[j]);
            }
            j++;
            n=n>>1;
        }
        Collections.sort(ans1);
        ans.add(ans1);
    }
}