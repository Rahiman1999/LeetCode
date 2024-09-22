class Solution {
  
    public int findKthNumber(int n, int k) {
        int curr=1;
        k-=1;
        while(k>0){
            int countNumber = count(curr,curr+1,n);
            if(countNumber<=k){
                curr++;
                k-=countNumber;
            }else{
                curr*=10;
                k-=1;
            }
        }
        return curr;
    }

    public int count(long curr,long next, int n){
        int countNum = 0;
        while(curr<=n){
            countNum+=(next-curr);
            curr*=10;
            next*=10;
            next=Math.min(next,(long)n+1);
        }
        return countNum;
    }
 
}