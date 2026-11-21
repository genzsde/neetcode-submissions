class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> smp = new HashMap<>();
        HashMap<Character, Integer> tmp = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(smp.containsKey(ch)){
                int temp = smp.get(ch);
                smp.put(ch, temp+1);
            }else{
                smp.put(ch, 1);
            }
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);

            if(tmp.containsKey(ch)){
                int temp = tmp.get(ch);
                tmp.put(ch, temp+1);
            }else{
                tmp.put(ch, 1);
            }
        }

        // case 1: (iterating the s)
        for(HashMap.Entry<Character, Integer> st: smp.entrySet()){
            char ch = st.getKey();
            if(tmp.containsKey(ch)){
                // if(tmp.get(ch) != st.getValue()){
                //     return false;
                // }
                if(!tmp.get(ch).equals(st.getValue())){
                    return false;
                }
            }else{
                return false;
            }
        }

        // case 2: (iterating the t)
        for(HashMap.Entry<Character, Integer> st: tmp.entrySet()){
            char ch = st.getKey();
            if(smp.containsKey(ch)){
                // if(smp.get(ch) != st.getValue()){
                //     return false;
                // }
                if(!smp.get(ch).equals(st.getValue())){
                    return false;
                }
            }else{
                return false;
            }
        }

        return true;
    }
}
