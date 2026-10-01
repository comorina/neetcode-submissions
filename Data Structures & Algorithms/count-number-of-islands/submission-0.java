class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        boolean[][] newArr = new boolean[row][col];

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if (grid[i][j] == '1' && !newArr[i][j]) {
                    count++;
                    dfs(i, j, grid, newArr);
                }
            }
        }
            return count;
    }
    private void dfs(int row, int col, char[][] grid, boolean[][] newArr){
            if(row<0 || row>= grid.length || col < 0 || col>=grid[0].length || grid[row][col] == '0' || newArr[row][col]){
                return;
            }

            newArr[row][col] = true;
        
            dfs(row - 1, col, grid, newArr); // up
            dfs(row + 1, col, grid, newArr); // down
            dfs(row, col - 1, grid, newArr); // left
            dfs(row, col + 1, grid, newArr); // right

        }
}
