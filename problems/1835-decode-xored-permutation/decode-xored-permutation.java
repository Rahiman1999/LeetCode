class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length;
        int ans[] = new int[n+1];
        int xorAll = 0;
        for(int i=1;i<=n+1;i++){
            xorAll^=i;
        }

        for(int i=0;i<encoded.length;i+=2){
            xorAll^=encoded[i];
        }
        int lastElement = xorAll;
        ans[n] = lastElement;

        for(int i=n-1;i>=0;i--){
            lastElement^=encoded[i];
            ans[i] = lastElement;
        } 

        return ans;
        
    }
}