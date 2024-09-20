class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                while(i<nums1.length-1&&nums1[i]==nums1[i+1]) i++;
                while(j<nums2.length-1&&nums2[j]==nums2[j+1]) j++;
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                  i++;
            }else{
                j++;
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}