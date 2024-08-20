class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if((n&(n-1))!=0) return false;
        int i=1;
        while((n!=4&&n!=0)&&i<32){
            n=n>>2;
            i++;
        }
        if(n==4) return true;
        return false;
    }
}
