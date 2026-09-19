
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> t1 = new HashMap<>();

        for (char c : s.toCharArray()) {
            s1.put(c, s1.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            t1.put(c, t1.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : s1.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();

            if (!t1.containsKey(character) ||
                !t1.get(character).equals(count)) {
                return false;
            }
        }

        return true;
    }
}
