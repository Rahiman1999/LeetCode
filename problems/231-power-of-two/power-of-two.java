// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         int k=1,i=1;
//         while(k<n&&i<32){
//            k=k<<1;
//            i++;
//         }
//         if(k==n){
//             return true;
//         }
//         return false;
//     }
// }
class Solution {
    public boolean isPowerOfTwo(int n) {
        long m=n;
        if(n==0){
            return false;
        }
        return ((m & m-1)==0);
    }
}