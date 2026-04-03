class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> mapT = new HashMap<>();
        HashMap<Character,Integer> mapS = new HashMap<>();
        for(char c : t.toCharArray()){
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }
        int l = 0, have = 0, need = mapT.size(), resLen = Integer.MAX_VALUE;
        int[] res = {-1,-1};
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
            if(mapT.containsKey(c) && mapS.get(c).equals(mapT.get(c))){
                have ++;
            }
            while(have == need){
                if((r - l + 1) < resLen){
                    resLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
                char left = s.charAt(l);
                mapS.put(left, mapS.get(left) - 1);

                if(mapT.containsKey(left) && mapS.get(left) < mapT.get(left)){
                    have --;
                }
                l++;
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
