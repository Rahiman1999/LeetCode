class Solution {
    Set<List<Integer>> hs = new HashSet<>();
    List<Integer> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates,target,0,candidates.length);
        return new ArrayList<>(hs);
    }
    public void solve(int[] A, int target, int index, int n) {
        if (target == 0) {
            hs.add(new ArrayList<>(ans));
            return;
        }

        for (int i = index; i < n; i++) {
            // Skip duplicates
            if (i > index && A[i] == A[i - 1]) continue;
            
            if (A[i] > target) break;  // Early exit if current number exceeds target

            ans.add(A[i]);
            solve(A, target - A[i], i + 1, n);  // Move to the next index
            ans.remove(ans.size() - 1);  // Backtrack
        }
    }
}