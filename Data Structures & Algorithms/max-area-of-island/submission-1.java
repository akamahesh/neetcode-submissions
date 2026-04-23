class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int maxArea = 0;
        for(int i = 0; i< ROWS ; i++){
            for(int j = 0; j < COLS; j++){
                if(grid[i][j] == 1){
                    //found land
                    int area = dfs(grid, i, j);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }

        return maxArea;
        

    }

    int dfs(int[][] grid, int row, int col){
        int ROWS = grid.length;
        int COLS = grid[0].length;

        if(row < 0 || col < 0 || row >= ROWS || col >= COLS || grid[row][col] == 0){
            return 0;
        }
        grid[row][col] = 0;
        int area = 1;
        area += dfs(grid, row, col+1);
        area += dfs(grid, row, col -1);
        area += dfs(grid, row +1 , col);
        area += dfs(grid, row - 1, col);

        return area;
    }
}
