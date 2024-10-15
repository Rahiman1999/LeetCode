class Solution {
    public long minimumSteps(String s) {
        int n=s.length();
        long minSteps=0;
        int i=0,j=n-1;
        while(i<j){
            while(i<j&&s.charAt(i)=='0') i++;
            while(j>i&&s.charAt(j)=='1') j--;
            if(s.charAt(i)=='1'&&s.charAt(j)=='0'){
                minSteps+=j-i;
                i++;
                j--;
            }
        }

        return minSteps;
    }
}