class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] vis = new boolean[row][col];
        int maxArea = 0;

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    int area =  dfs(i, j, grid, vis);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    int dfs(int row, int col, int[][] grid, boolean[][] vis){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || vis[row][col] || grid[row][col] == 0){
            return 0;
        }
        // count the area
        int area = 1;

        // Marked Visited
        vis[row][col] = true;

        area += dfs(row-1, col, grid, vis); // up
        area += dfs(row+1, col, grid, vis); // down
        area += dfs(row, col-1, grid, vis); // left
        area += dfs(row, col+1, grid, vis); //right

        return area;
    }

}
