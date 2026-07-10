class Solution {
    public int characterReplacement(String s, int k) {
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for(char c : s.toCharArray()){
            set.add(c);
        }
        for(char c : set){
            int l = 0, cnt = 0;
            for(int r = 0; r < s.length(); r++){
                if(s.charAt(r) == c){
                    cnt ++;
                }
                while((r - l + 1) - cnt > k){
                    if(s.charAt(l) == c){
                        cnt --;
                    }
                    l++;
                }
                res = Math.max(res, r - l + 1);
            }
        }
        return res;
    }
}
