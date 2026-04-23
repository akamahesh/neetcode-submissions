class Solution {
    public int trap(int[] height) {

        int start = 0;
        int end = height.length - 1;
        int trapArea = 0;
        int maxStart = height[start];
        int maxEnd = height[end];
        while(start < end){
            if(maxStart <= maxEnd){
                start++;
                maxStart = Math.max(height[start], maxStart);
                trapArea += maxStart - height[start];
                
            }else{
                end--;
                maxEnd = Math.max(height[end], maxEnd);
                trapArea += maxEnd - height[end];
                
            }
        }
        return trapArea;
    }
}
