class Solution {
    public int minExtraChar(String s, String[] dictionary) {
         Set<String> hs = new HashSet<>();
        int dp[] = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        
        // Add dictionary words to the set for quick lookup
        for (String word : dictionary) {
            hs.add(word);
        }
        
        // Start solving from index 0
        return solve(s, 0, dp, hs, s.length());
    }

    // Recursive function to solve the problem with memoization
    public int solve(String s, int index, int[] dp, Set<String> hs, int n) {
        if (index >= n) return 0; // No more characters left to process
        
        if (dp[index] != -1) return dp[index]; // Return memoized result

        // Initialize result by considering skipping the current character (counting it as an extra)
        int result = 1 + solve(s, index + 1, dp, hs, n);

        // Try all possible substrings starting at the current index
        for (int i = index; i < n; i++) {
            String curr = s.substring(index, i + 1);
            if (hs.contains(curr)) {
                result = Math.min(result, solve(s, i + 1, dp, hs, n)); // Check for minimal result
            }
        }

        // Memoize the result for the current index
        return dp[index] = result;
    }
}