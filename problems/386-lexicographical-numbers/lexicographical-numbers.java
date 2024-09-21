class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        for(int startNum=1;startNum<=9;startNum++)
          solve(startNum,n);
        return ans;
    }
    public void solve(int curr,int n){
        if(curr>n){
            return;
        }
        ans.add(curr);
        for(int append=0;append<=9;append++){
            int newNum=curr*10+append;
            if(newNum>n) return;
            solve(newNum,n);
        }
    }
}