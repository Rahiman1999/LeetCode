class Solution {
    public int countPairs(int[] nums) {
            

        int res=0;
        int len = nums.length;

        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(isboolean(nums[i],nums[j])){
                    res++;
                }
            }
        }
        return res;
    }

    private boolean isboolean(int x,int y){
        String xStr = String.valueOf(x);
        String yStr = String.valueOf(y);
        while(xStr.length()<yStr.length()){
            xStr="0"+xStr;
        }
        while(xStr.length()>yStr.length()){
            yStr="0"+yStr;
        }
        int digitCount=0;
        List<Integer> index = new ArrayList<>();
        for(int i=0;i<xStr.length();i++){
            if(xStr.charAt(i)!=yStr.charAt(i)){
                digitCount++;
                index.add(i);
                if(digitCount>2) return false;
            }
        }
        if(digitCount==0){
            return true;
        }
        if(digitCount==2){
            char xchar[] = xStr.toCharArray();
            char temp = xchar[index.get(0)];
            xchar[index.get(0)] = xchar[index.get(1)];
            xchar[index.get(1)]=temp;

            return String.valueOf(xchar).equals(yStr);
        }
        return false;
    }
}
