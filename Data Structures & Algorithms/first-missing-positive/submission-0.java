class Solution {
    public int firstMissingPositive(int[] nums) {
        int ans = 0;
        HashSet<Integer> st = new HashSet<>();
        int maxi = 0;

        for(int i: nums){
            if(i > maxi){
                maxi = i;
            }
            st.add(i);
        }

        for(int i=1; i<=maxi; i++){
            if(!st.contains(i)){
                return i;
            }
        }

        return maxi+1;
    }
}