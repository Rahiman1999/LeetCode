class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(arr[a]-arr[b]));

        for(int i=0;i<arr.length;i++){
            pq.offer(i);
        }
        int[] ans = new int[arr.length];
        int c=1;
        while(!pq.isEmpty()){
            int ind = pq.poll();
            ans[ind]=c;
            while(!pq.isEmpty()&&arr[pq.peek()]==arr[ind]){
                ans[pq.poll()] = c;
            }
            c++;
        }
        return ans;
    }
}