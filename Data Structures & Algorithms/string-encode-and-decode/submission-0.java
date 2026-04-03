class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder sb1 = new StringBuilder();
        List<Integer> sizes  = new ArrayList<>();
        for(String s : strs){
            sizes.add(s.length());
        }
        for(int size : sizes){
            sb1.append(size).append(',');
        }
        sb1.append('#');
        for(String st : strs){
            sb1.append(st);
        }
        return sb1.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0) return new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        int i = 0;
        while(str.charAt(i) != '#'){
            StringBuilder sb2 = new StringBuilder();
            while(str.charAt(i) != ','){
                sb2.append(str.charAt(i));
                i++;
            }
            nums.add(Integer.parseInt(sb2.toString()));
            i++;
        }
        i++;
        for(int num : nums){
            strings.add(str.substring(i, i + num));
            i += num;
        }
        return strings;
    }
}
