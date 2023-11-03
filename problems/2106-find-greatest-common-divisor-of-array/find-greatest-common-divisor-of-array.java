class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }

        return GCD(min,max);
    }

    public static int GCD(int A,int B){
        if(A<B){
            int temp = A;
            A=B;
            B=temp;
        }
        if(B==0){
            return A;
        }
        return GCD(B,A%B);
    }
}