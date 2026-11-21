class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int ans = 0;
        HashSet<Integer> st = new HashSet<>();
        for(int s: nums){
            if(st.contains(s)){
                continue;
            }else{
                st.add(s);
            }
        }

        for(int x: nums){
            if(!st.contains(x-1)){
                int temp = 0;
                while(st.contains(x)){
                    temp++;
                    x = x+1;
                }
                ans = Math.max(ans, temp);
            }
        }

        return ans;
    }
}
