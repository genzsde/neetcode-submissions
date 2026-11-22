class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i: nums){
            pq.add(i);
        }

        int [] arr = new int[pq.size()];
        int i=0;
        while(!pq.isEmpty()){
            arr[i++] = pq.poll();
        }
        return arr;
    }
}