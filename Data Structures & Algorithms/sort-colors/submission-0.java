class Solution {
    public void sortColors(int[] nums) {
        int[] colorCounts = new int[]{0,0,0};
        for(int i : nums){
            colorCounts[i] += 1;
        }

        int index = 0;
        for(int i = 0; i < colorCounts.length; i++){
            for(int j =0; j < colorCounts[i]; j++){
                nums[index] = i;
                index++;
            }
        }
        
    }
}