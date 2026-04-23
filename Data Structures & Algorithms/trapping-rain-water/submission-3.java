class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int trapArea = 0;
        int maxStart = 0;
        int maxEnd = 0;
        while(start < end){
            maxStart = Math.max(height[start], maxStart);
            maxEnd = Math.max(height[end], maxEnd);
            
            
            

            
            if(maxStart <= maxEnd){
                int diff = Math.min(maxStart, maxEnd);
                int area = diff - height[start];
                if(area>0){
                    trapArea += area;
                }
                start++;
            }else{
                int diff = Math.min(maxStart, maxEnd);
                int area = diff - height[end];
                if(area>0){
                    trapArea += area;
                }
                end--;
            }
        }
        return trapArea;
    }
}
