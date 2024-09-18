// class Solution {
//     public int strStr(String haystack, String needle) {
//         int index=-1;
//         int len=0;
//         if(haystack.length()<needle.length()){
//             return -1;
//         }
//         for(int i=0;i<=haystack.length()-needle.length();i++){
//             int j=0;
//             while(j<needle.length()&&haystack.charAt(i+j)==needle.charAt(j)){
//                 j++;
//             }
//             if(j==needle.length()){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}