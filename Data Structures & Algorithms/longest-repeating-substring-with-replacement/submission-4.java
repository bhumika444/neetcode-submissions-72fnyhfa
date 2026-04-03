class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0, count = 0, res = 0;
        for(int r = 0; r < s.length(); r++){
            // char c = s.charAt(r);
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            count = Math.max(count, map.get(s.charAt(r)));

            while((r - l + 1) - count > k){
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
