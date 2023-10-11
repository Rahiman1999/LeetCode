class Solution {
    public int mySqrt(int A) {
         if(A==1){
            return 1;
        }
        long left = 1;
        long right = A/2;
        long mid = 0;
        long ans = 0;
        while(left<=right){
            mid=(left+right)/2;
            if(mid*mid==A){
                return (int)mid;
            }else if(mid*mid>A){
                right= mid -1;
            }else{
                ans = mid;
                left = mid+1;
            }
        }

        return (int)ans;
    }
}