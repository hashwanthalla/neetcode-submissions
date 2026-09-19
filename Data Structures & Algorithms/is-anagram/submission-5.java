class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character,Integer> s1 = new HashMap<>();
         HashMap<Character,Integer> t1 = new HashMap<>();
         if(s.length()!=t.length()){
            return false;
         }
         for(int i=0;i<s.length();i++){
            if(s1.containsKey(s.charAt(i))){
                s1.put(s.charAt(i),s1.get(s.charAt(i))+1);
            }  else{
                s1.put(s.charAt(i),1);
            }
         }
         for(int j=0;j<t.length();j++){
             if(t1.containsKey(t.charAt(j))){
                t1.put(t.charAt(j),t1.get(t.charAt(j))+1);
             } else {
                t1.put(t.charAt(j),1);
             }
         }

         for (Map.Entry<Character, Integer> entry : s1.entrySet()) {
        if(!t1.containsKey(entry.getKey())||!t1.get(entry.getKey()).equals(entry.getValue())){
        return false;
    }

}
         return true;
    }
}
