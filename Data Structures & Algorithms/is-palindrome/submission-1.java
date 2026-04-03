class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int l=0,r=n-1;
        while(l<r)
        {
            while((l<r)&& !isAlphaNumeric(s.charAt(l)))
            {
                l++;
            }
            while((l<r) && !isAlphaNumeric(s.charAt(r)))
            {
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isAlphaNumeric(char c)
    {
        if(c>='0' && c<='9' || c>='a' && c<='z' || c>='A' && c<='Z')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}