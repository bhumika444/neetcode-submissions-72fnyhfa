class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0) return "";
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for(String s : strs){
            int size = s.length();
            list.add(size);
        }
        for(int n : list){
            sb.append(n).append(',');
        }
        sb.append('#');
        for(String s : strs){
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        // StringBuilder b = new StringBuilder();
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while(str.charAt(i) != '#') {
            StringBuilder b = new StringBuilder();
            while(str.charAt(i) != ','){
                b.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(b.toString()));
            i++;
        }
        i++;
        for(int n : sizes){
            list.add(str.substring(i, i + n));
            i += n;
        }
        return list;
    }
}
