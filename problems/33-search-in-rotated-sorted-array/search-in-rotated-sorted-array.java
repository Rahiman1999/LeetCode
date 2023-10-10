class Solution {
    public int search(int[] A, int B) {
         int left = 0;
        int right = A.length-1;
        int mid = 0;
        int k = secondSortedArray(A,left,right,mid,0);
        if(k==0){
            return binarySearch(A,left,right,mid,B);
        }
        if(A[0]>B){
            return binarySearch(A,k,right,mid,B);
        }else{
            return binarySearch(A,left,k-1,mid,B);
        }
    }
    public static int secondSortedArray(int[] A,int left,int right, int mid,int k){
        k=0;
        while(left<=right){
            mid=(left+right)/2;
            if(A[0]>A[mid]){
                k=mid;
                right=mid-1;             
            }else{
                left=mid+1;
            }
        }
        return k;
    }

    public static int binarySearch(int[] A,int left,int right,int mid, int B){
        while(left<=right){
            mid = (left+right)/2;
            if(A[mid]==B){
                return mid;
            }
            if(A[mid]>B){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return -1;
    }
}