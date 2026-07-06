class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0, j =0;
        int maxlength = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                
                maxlength = Math.max(maxlength, j-i);
            } 
            else {
                set.remove(s.charAt(i));
                
                i++;
            }
        }
        return maxlength;
    }
}
