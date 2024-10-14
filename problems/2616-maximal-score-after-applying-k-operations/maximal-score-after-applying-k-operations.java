class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int value:nums){
            pq.add(value);
        }
        long score=0;
        while(k>0){
            int value = pq.poll();
            score+=value;
            pq.add((int)Math.ceil(value/3.0));
            k--;
        }
        return score;
    }
}