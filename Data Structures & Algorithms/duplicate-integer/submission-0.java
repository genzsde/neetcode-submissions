class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int x: nums){
            if(st.contains(x)){
                return true;
            }else{
                st.add(x);
            }
        }

        return false;
    }
}