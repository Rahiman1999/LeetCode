class Solution {
    public int maxUniqueSplit(String s) {
        return backtrack(s, 0, new HashSet<>());
    }

    private int backtrack(String s, int start, Set<String> uniqueSubstrings) {
        if (start == s.length()) {
            return 0;  // Base case: If the whole string is processed
        }
        
        int maxSplits = 0;
        
        for (int i = start + 1; i <= s.length(); i++) {
            String substring = s.substring(start, i);
            
            if (!uniqueSubstrings.contains(substring)) {  // Only proceed if substring is unique
                uniqueSubstrings.add(substring);  // Add current substring to the set
                
                // Recurse and count unique splits from the rest of the string
                maxSplits = Math.max(maxSplits, 1 + backtrack(s, i, uniqueSubstrings));
                
                uniqueSubstrings.remove(substring);  // Backtrack and remove the substring
            }
        }
        
        return maxSplits;
    }
}
