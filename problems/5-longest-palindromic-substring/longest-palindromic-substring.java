class Solution {
    public String longestPalindrome(String s) {
        int max_len=0;
        int start=0;int n=s.length();
        int end=0;
        for(int i=1;i<n;i++){
            int low=i-1;
            int high=i;
            while(low>=0&&high<n&&s.charAt(low)==s.charAt(high)){
                if(high-low+1>max_len){
                    max_len=high-low+1;
                    start=low;
                    end=high;
                }
                low--;
                high++;
            }
            low=i-1;
            high=i+1;
            while(low>=0&&high<n&&s.charAt(low)==s.charAt(high)){
                if(high-low+1>max_len){
                    max_len=high-low+1;
                    start=low;
                    end=high;
                }
                low--;
                high++;
            }

        }

        String ans="";
        for(int i=start;i<=end;i++){
            ans+=s.charAt(i);
        }
        return ans;
        
    }
}