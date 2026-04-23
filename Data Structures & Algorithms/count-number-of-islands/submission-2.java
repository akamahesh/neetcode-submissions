class Solution {
    public int numIslands(char[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int island = 0;

        for(int i = 0; i< ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(grid[i][j] == '1'){
                    island++;
                    dfs(grid, i, j);
                }
            }
        }
        
        return island;
        
    }

    void dfs(char[][] grid, int row, int col){
        int ROWS = grid.length;
        int COLS = grid[0].length;
        if(row < 0 || col < 0 || row >= ROWS || col >= COLS || grid[row][col] == '0'){
            return;
        }
        grid[row][col] = '0';
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
        dfs(grid, row +1 , col);
        dfs(grid, row - 1, col);
        
    }


}
