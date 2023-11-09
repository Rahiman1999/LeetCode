class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();
        permutation(nums,new boolean[nums.length],new ArrayList<>(),res);
        return new ArrayList<>(res);
    }
    public static void permutation(int A[],boolean[] selected,ArrayList<Integer> ans,
    HashSet<List<Integer>> res){
       
        if(A.length==ans.size()){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<A.length;i++){
            if(selected[i]==false){
                selected[i]=true;
                ans.add(A[i]);
                permutation(A,selected,ans,res);
                selected[i] = false;
                ans.remove(ans.size()-1);
                System.out.println(ans);
            }
        }
    }
}