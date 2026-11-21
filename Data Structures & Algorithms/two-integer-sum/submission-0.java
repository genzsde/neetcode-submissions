class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> st = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int number = target - nums[i];

            if(st.containsKey(number)){
                int currI = st.get(number);
                ans[0] = currI;
                ans[1] = i;
                return ans;
            }else{
                st.put(nums[i], i);
            }
        }

        return ans;
    }
}
