class Solution {
    Set<List<Integer>> hs = new HashSet<>();
    List<Integer> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        solve(k,n,1);
        return new ArrayList<>(hs);
    }
    public void solve(int k,int n,int i){
        if(n==0&&k==0){
            hs.add(new ArrayList<>(ans));
            
            return;
        }

        for(int j=i;j<=9;j++){
            if(j>n){
                break;
            }
            ans.add(j);
            solve(k-1,n-j,j+1);
            ans.remove(ans.size()-1);
        }
        
    }
}