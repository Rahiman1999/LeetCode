class Solution {
    Set<List<Integer>> hs = new HashSet<>();
    List<Integer> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        solve(arr,k,n,0);
        return new ArrayList<>(hs);
    }
    public void solve(int[] arr,int k,int n,int i){
        if(ans.size()==k){
            if(n==0){
                hs.add(new ArrayList<>(ans));
            }
            return;
        }
        if(i==arr.length){
            return;
        }

        if(arr[i]<=n){
            ans.add(arr[i]);
            solve(arr,k,n-arr[i],i+1);
            ans.remove(ans.size()-1);
        }
        solve(arr,k,n,i+1);
    }
}