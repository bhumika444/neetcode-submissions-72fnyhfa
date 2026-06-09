class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r){
            while(l < r && !isAlphaNum(s.charAt(l))){
                l++;
            }
            while(l < r && !isAlphaNum(s.charAt(r))){
                r--;
            }
            while(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isAlphaNum(char c){
        if(c <= '9' && c >= '0' || c <= 'z' && c >= 'a' || c >= 'A' && c <= 'Z'){
            return true;
        }
        return false;
    }
}
