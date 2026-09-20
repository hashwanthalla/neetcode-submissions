class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);

            if(!hm.containsKey(key)){
                List<String> lls = new ArrayList<>();
                lls.add(s);
                hm.put(key,lls);
            } else{
                List<String> str1 = hm.get(key);
                str1.add(s);
               hm.put(key, str1);
            }
        }
        for (Map.Entry<String, List<String>> entry : hm.entrySet()) {
    List<String> ss = entry.getValue();
    res.add(ss);
        
}
return res;

    }
}
