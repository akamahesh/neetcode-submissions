class Solution {
    /*
        input = [1,7,2,5,4,7,3,6]
        input = [1,2,3,4,5,6,7,7]
        
    */
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length -1;
        int maxArea = 0;
        while(start< end){
            int diff = end - start;
            int area = diff * Math.min(heights[start], heights[end]);
            maxArea = Math.max(area, maxArea);
            if(heights[start] < heights[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;
        
    }
}
