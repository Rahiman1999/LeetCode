class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int ans[][] = new int[k][2];
        Arrays.sort(points,Comparator.comparing(P->P[0]*P[0]+P[1]*P[1]));
        return Arrays.copyOfRange(points,0,k);
       
    }
}