class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        int right = 0;
        HashSet<Integer> window = new HashSet<>();
        while(right < nums.length){
            if(right-left > k){
                window.remove(nums[left]);
                left++;
            }
            if(window.contains(nums[right])){
                return true;
            }
            window.add(nums[right]);
            right++;
        }
        return false;
    }
}