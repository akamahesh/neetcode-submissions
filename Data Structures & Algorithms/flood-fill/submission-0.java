class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int og = image[sr][sc];
        if(og == color){
            return image;
        }
        dfs(image, sr, sc, color, og);
        return image;
    }

    void dfs(int[][] image, int sr, int sc, int color, int ogColor){
        int ROWS = image.length;
        int COLS = image[0].length;

        if (sr < 0 || sr >= ROWS || sc >= COLS || sc < 0 || image[sr][sc] != ogColor) {
            return;
        }
        image[sr][sc] = color;
        dfs(image, sr, sc + 1, color,ogColor);
        dfs(image, sr, sc - 1, color,ogColor);
        dfs(image, sr + 1, sc, color,ogColor);
        dfs(image, sr - 1, sc, color,ogColor);
    }
}