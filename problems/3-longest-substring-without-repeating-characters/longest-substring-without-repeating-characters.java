class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> set= new HashMap<>();
        int left=0;
        int ans=0;
        for(int right=0;right<s.length();right++){
            if(set.containsKey(s.charAt(right))&&set.get(s.charAt(right))>=left){
                left = set.get(s.charAt(right))+1;
            }
            ans = Math.max(ans,right-left+1);
            set.put(s.charAt(right),right);
        }
        return ans;
    }
}