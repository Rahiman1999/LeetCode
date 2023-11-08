class Solution {
    public static boolean checkbit(int value,int i){
        if(((value>>i)&1)==1){
            return true;
        }
        return false;
    }
    public int[] singleNumber(int[] nums) {

        int value = 0;
        for(int i=0;i<nums.length;i++){
            value^=nums[i];
        }
        int pos=0;

        for(int i=0;i<31;i++){
            if(checkbit(value,i)){
                pos = i;
                break;
            }
        }

        int set=0,unset=0;
        for(int i=0;i<nums.length;i++){
            if(checkbit(nums[i],pos)){
                set^=nums[i];
            }else{
                unset^=nums[i];
            }
        }

        int ans[] =new int[2];
        if(set<unset){
            ans[0]=set;
            ans[1]=unset;
        }else{
            ans[1]=set;
            ans[0]=unset;
        }
        return ans;
    }
}