class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int len = Integer.MAX_VALUE;
        int sum = 0;
        while(right < nums.length){
            sum += nums[right];
            while(sum >= target){
                len = Math.min(right - left + 1, len);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        if(len == Integer.MAX_VALUE)
            len = 0;
        return len;
    }
}