class Solution {
    public int[] countBits(int n) {

      int ans[] = new int[n+1];

      for(int i=0;i<=n;i++){
          int countBit=i;
          int count=0;
          while(countBit!=0){
            countBit=countBit&(countBit-1);
            count++;
          }
          ans[i]=count;
      }  
        return ans;
    }
}