class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int j=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(!Character.isLetterOrDigit(s.charAt(i))) continue;
            if(!Character.isLetterOrDigit(s.charAt(j))){
                i--;
                j--;
                continue;
            }
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
