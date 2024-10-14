class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>((a,b)->Long.compare(b,a));
        for(int value:nums){
            pq.add((long)value);
        }
        long score=0;
        while(k>0){
            long value = pq.poll();
            score+=value;
            pq.add((long)Math.ceil(value/3.0));
            k--;
        }
        // System.out.println(Math.ceil(10/3.0));
        return score;
    }
}