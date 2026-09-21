class Solution {
    public boolean isIsomorphic(String s, String t) {
       if (s.length() != t.length()) return false;

        int[] lastSeenS = new int[256]; 
        int[] lastSeenT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (lastSeenS[a] != lastSeenT[b]) return false;

            lastSeenS[a] = i + 1;
            lastSeenT[b] = i + 1;
        }  
        return true;
    }
}