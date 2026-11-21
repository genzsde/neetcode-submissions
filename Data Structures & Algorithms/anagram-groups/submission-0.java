class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, ArrayList<String>> mp = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String temp = strs[i];
            char[] ch = temp.toCharArray();
            Arrays.sort(ch);
            temp = new String(ch);

            if(mp.containsKey(temp)){
                ArrayList<String> tempArr = mp.get(temp);
                tempArr.add(strs[i]);
                mp.put(temp, tempArr);
            }else{
                ArrayList<String> tempArr = new ArrayList<>();
                tempArr.add(strs[i]);
                mp.put(temp, tempArr);
            }
        }

        for(HashMap.Entry<String, ArrayList<String>> i: mp.entrySet()){
            ans.add(i.getValue());
        }
        return ans;
    }
}
