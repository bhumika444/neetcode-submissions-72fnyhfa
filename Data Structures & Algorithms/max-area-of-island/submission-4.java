class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    area = Math.max(area, bfs(grid, i, j));
                }
            }
        }
        return area;
    }
    public int bfs(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
        return 1 + bfs(grid, i + 1, j) + bfs(grid, i - 1, j) + bfs(grid, i, j + 1) + bfs(grid, i, j - 1);
    }
}
