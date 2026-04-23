class Solution {
    public int numIslands(char[][] grid) {
        int ROW = grid.length;
        int COL = grid[0].length;

        int island = 0;
        for(int r = 0; r < ROW; r++){
            for(int c = 0; c < COL ; c++){
                if(grid[r][c] == '1'){
                    island++;
                    dfs(grid, r, c);
                }
            }
        }
        return island;
    }

    void dfs(char[][] grid, int row, int col){
        //terminate conditions 
        if(row <0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0'){
            return;
        }
        // visit all connected land cells and mark them as water
        grid[row][col] = '0';
        dfs(grid, row, col + 1);
        dfs(grid, row +1, col);
        dfs(grid, row, col-1);
        dfs(grid, row -1 , col);
    }


}
