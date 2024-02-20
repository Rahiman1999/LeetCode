class Solution {
    public boolean isAnagram(String s, String t) {

        char s_char[] = s.toCharArray();
        char t_char[] = t.toCharArray();
        Arrays.sort(s_char);
        Arrays.sort(t_char);
        if(Arrays.toString(s_char).equals(Arrays.toString(t_char))){
            return true;
        }

       
        return false;
    }
}