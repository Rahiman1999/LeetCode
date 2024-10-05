class Solution {
    public boolean checkInclusion(String s1, String s2) {
		if(s1.length()>s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for(int i=0;i<s1.length();i++){
            s1Count[s1.charAt(i)-'a']++;
            s2Count[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length()-s1.length();i++){
            if(match(s1Count,s2Count)) return true;
            s2Count[s2.charAt(i)-'a']--;
            s2Count[s2.charAt(i+s1.length())-'a']++;
        }

        return match(s1Count,s2Count);
    }

    private boolean match(int[] s1, int[] s2){
        for(int i=0;i<26;i++){
            if(s1[i]!=s2[i]) return false;
        }
        return true;
    }
}