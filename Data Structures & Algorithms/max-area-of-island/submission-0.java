class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int ROW = grid.length;
        int COL = grid[0].length;
        int maxArea = 0;

        for(int r = 0; r < ROW; r++){
            for(int c = 0; c < COL ; c++){
                if(grid[r][c]== 1){
                    int area = dfs(grid, r,c);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }
        return maxArea;
        
    }

    private int dfs(int[][] grid, int row, int col ){
        //termination
        int ROW = grid.length;
        int COL = grid[0].length;
        if(row < 0 || col < 0 || row == ROW || col == COL || grid[row][col] == 0){
            return 0;
        }
        grid[row][col] = 0;
        int area = 1;
        area += dfs(grid, row, col +1);
        area += dfs(grid, row +1, col);
        area += dfs(grid, row , col - 1);
        area += dfs(grid, row -1 , col);
        return area;
    }
}