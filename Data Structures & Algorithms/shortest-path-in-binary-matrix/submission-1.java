class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;
        if(grid[0][0] == 1 || grid[ROWS-1][COLS-1] == 1){
            return -1;
        }
        int length = 1;
        Deque<int[]> queue = new ArrayDeque();
        queue.add(new int[]{0,0});
        int[][] visited = new int[ROWS][COLS];
        visited[0][0] = 1;

        // 8-directional movement (4 cardinal + 4 diagonal)
        int[][] directions = {
                {1, 0}, {-1, 0}, {0, 1}, {0, -1},   // cardinal
                {1, 1}, {1, -1}, {-1, 1}, {-1, -1}   // diagonal
        };

        while(!queue.isEmpty()){
            // snapshot layer size, process all cells at the current distancase
            int layerSize = queue.size();
            for(int i = 0; i< layerSize; i++){
                int[] cell = queue.poll();
                int row = cell[0];
                int col = cell[1];
                //first time we reach the destination is always the shortest pathabstract
                if(row == ROWS -1 && col == COLS - 1)return length;

                for(int[] dir: directions){
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    
                    //check for bounds 
                    if(newRow < 0 || newCol < 0 || newRow >= ROWS || newCol >= COLS) continue; //out of bound
                    if(grid[newRow][newCol] == 1) continue;
                    if(visited[newRow][newCol] == 1) continue;

                    queue.add(new int[]{newRow, newCol});
                    visited[newRow][newCol] = 1;
                }
            }
            length++;
            

        }
        return -1;

    }
}