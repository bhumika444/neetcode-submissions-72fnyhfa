class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;
        int count[] = new int[26];
        for(char c : s1.toCharArray()){
            count[c - 'a']++;
        }
        int need = s1.length();
        for(int r = 0; r < s2.length(); r++){
            char c = s2.charAt(r);
            count[c - 'a'] --;
            if(count[c - 'a'] >= 0) need --;
            
            if(r >= s1.length()){
                char left = s2.charAt(r - s1.length());
                if(count[left - 'a'] >= 0) need ++;
                count[left - 'a'] ++;
            }
            if(need == 0) return true;
        }
        return false;
    }
}
