class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum = Math.max(currSum, 0);
            currSum += nums[i];

            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
