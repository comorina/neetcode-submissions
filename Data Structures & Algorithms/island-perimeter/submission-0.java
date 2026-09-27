class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int pre = 0;
        for(int i = 0; i<row; i++){ // iteration on row
            for(int j =0; j<col; j++){ // iteration on column

                if(grid[i][j] == 1){
                    pre+=4;
                
                // check for top
                if(i>0 && grid[i-1][j] == 1){
                    pre--;
                }

                // check for left
                if(j>0 && grid[i][j-1] == 1){
                    pre--;
                }

                // check for right
                if(j<col-1 && grid[i][j+1] == 1){
                    pre--;
                }

                // check for down
                if(i<row-1 && grid[i+1][j] == 1){
                    pre--;
                }
                }
            }
        }
        return pre;
    }
}