class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j){
            while(i < j && !isAlphaNum(s.charAt(i))){
                i++;
            }
            while(i < j && !isAlphaNum(s.charAt(j))){
                j--;
            }
            while(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isAlphaNum(char c){
        if(c >= '0' && c <='9' || c >= 'a' && c <= 'z' || c >= 'A' && c <='Z')
            return true;
        return false;
    }
}
