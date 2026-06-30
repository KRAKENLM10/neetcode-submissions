class Solution {
    public String encode(List<String> strs) {
        String s = "";
        for (int i = 0; i < strs.size(); i++) {
            s = s + strs.get(i)+ ";";
        }
        return s;
    }

    public List<String> decode(String str) {
        List<String> l1 = new ArrayList<>();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char a=str.charAt(i);
            if (a != ';') {
                s=s+a;
            } else {
                l1.add(s);
                s = "";
            }
        }
        
        return l1;
    }
}
