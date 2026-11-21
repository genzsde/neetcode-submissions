class Solution {
    List<String> temp = new ArrayList<>();
    public String encode(List<String> strs) {
        temp = strs;
        return "";
    }

    public List<String> decode(String str) {
        return temp;
    }
}
