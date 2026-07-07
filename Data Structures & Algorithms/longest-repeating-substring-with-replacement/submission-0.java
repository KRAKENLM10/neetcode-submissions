class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();
        int window=0;
        int i=0;
        int max=0;
        for(int j=0;j<s.length();j++){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
            max=Math.max(max, map.get(s.charAt(j)));
            while(j-i+1-max>k){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                i++;
            }
            window=Math.max(window,j-i+1);
        }
        return window;
    }
}
