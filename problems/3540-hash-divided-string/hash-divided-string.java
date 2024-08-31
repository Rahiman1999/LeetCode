class Solution {
    public String stringHash(String s, int k) {
        int x=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            x+=s.charAt(i)-'a';
          if((i+1)%k==0){
            x=(x%26)+'a';
            ans+=String.valueOf((char)x);
            x=0;
          }
        }

        return ans;
        
    }
}