class Solution {
    public int longestConsecutive(int[] nums) {
        ArrayList<Integer> tempArray = new ArrayList<>();
        if(nums.length == 1){
            return 1;
        }
        int ans = 0;
        HashSet<Integer> st = new HashSet<>();
        for(int s: nums){
            if(st.contains(s)){
                continue;
            }else{
                tempArray.add(s);
                st.add(s);
            }
        }

        for(int x: tempArray){
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
