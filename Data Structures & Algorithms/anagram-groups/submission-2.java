class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagramsList = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            List<String> anagramList = new ArrayList<>();
            String s = strs[i];
            if(s == null)
                continue;
            anagramList.add(s);
            strs[i]  = null;
            for (int j = i + 1; j < strs.length; j++) {
                String t = strs[j];
                if(validAnagram(s, t)){
                    anagramList.add(t);
                    strs[j]  = null;
                }
            }
            groupAnagramsList.add(anagramList);
        }
        return groupAnagramsList;
    }

     public boolean validAnagram(String s, String t) {
        boolean isAnagram = true;
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            int count = 0;
            if (charMap.containsKey(c)) {
                count = charMap.get(c);
            }
            charMap.put(c, count + 1);
        }
        for (char c : t.toCharArray()) {
            if (charMap.containsKey(c)) {
                int count = charMap.get(c);
                if (count > 1) {
                    charMap.put(c, count - 1);
                } else {
                    charMap.remove(c);
                }
            } else {
                isAnagram = false;
                break;
            }
        }

        return isAnagram;
    }
}
