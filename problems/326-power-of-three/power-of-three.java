class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n==0) return false;
        // if(n==1) return true;
        // return n%3==0&&isPowerOfThree(n/3);

        long temp=1;
       int i=1;
       while(n>1 && temp<n)
       {
           temp+=temp<<1;
           
       }
       
       return temp==n;
    }
}