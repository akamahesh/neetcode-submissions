class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        HashSet<Character> windowSet = new HashSet<Character>();
        int result = Integer.MIN_VALUE;
        while(right < s.length()){
            while(windowSet.contains(s.charAt(right))){
                windowSet.remove(s.charAt(left));
                left++;
            }
            windowSet.add(s.charAt(right));
            result = Math.max(result, right - left +1);
            right++;
        }
        if(result == Integer.MIN_VALUE)
            result = 0;
        return result;
    }
}
