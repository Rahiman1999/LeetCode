class Solution {
    public int maximumSwap(int num) {

        char[] numArr= Integer.toString(num).toCharArray();
        int n=numArr.length;
        int[] ind = new int[n];
        ind[n-1]=n-1;

        for(int i=n-2;i>=0;i--){
            if((int)numArr[i]<=(int)numArr[ind[i+1]]){
                ind[i]=ind[i+1];
            }else{
                ind[i]=i;
            }
        }
        
        for(int i=0;i<n;i++){
            if(i!=ind[i]&&numArr[i]!=numArr[ind[i]]){
                char temp = numArr[i];
                numArr[i] = numArr[ind[i]];
                numArr[ind[i]] = temp;
                return Integer.parseInt(new String(numArr));
            }
        }
        
        return num;
    }
}