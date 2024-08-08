class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxx = Integer.MIN_VALUE;

        while(i<=j){
            int minValue = Math.min(height[i],height[j]);
            maxx = Math.max(minValue*(j-i),maxx);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxx;
    }
}