class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isAnagram = true;
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> charMap = new HashMap<>();
        for(char c: s.toCharArray()){
            int count = 0;
            if(charMap.containsKey(c)){
                count = charMap.get(c);
            }
            charMap.put(c, count + 1);
        }
        for(char c: t.toCharArray()){
            if(charMap.containsKey(c)){
                int count = charMap.get(c);
                if(count>1){
                    charMap.put(c, count -1);
                }else{
                    charMap.remove(c);
                }
            }else {
                isAnagram = false;
                break;
            }
        }

        return isAnagram;
    }
}
