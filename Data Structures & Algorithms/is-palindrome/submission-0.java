class Solution {
    public boolean isPalindrome(String si) {
        String input = si.toLowerCase();
        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (!isAlphanumeric(input.charAt(start))) {
                start++;
                continue;
            }
            if (!isAlphanumeric(input.charAt(end))) {
                end--;
                continue;
            }
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        return isPalindrome;
    }

    public boolean isAlphanumeric(char c) {
        return (c > 47 && c < 58) || (c > 64 && c < 91) || (c > 96 && c < 123);
    }
}
