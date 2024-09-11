class Solution {
    HashSet<List<Integer>> hs = new HashSet<>();
    ArrayList<Integer> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        uniqueCombination(candidates,target,0,candidates.length);
        return new ArrayList<>(hs);
    }
    public void uniqueCombination(int[] candidates,int target,int i,int n){
        if(i==n){
            if(target==0){
                hs.add(new ArrayList<>(ans));
            }
            return;
        }
        if(candidates[i]<=target){
            ans.add(candidates[i]);
            uniqueCombination(candidates,target-candidates[i],i,n);
            ans.remove(ans.size()-1);
        }
        uniqueCombination(candidates,target,i+1,n);
    }
}
