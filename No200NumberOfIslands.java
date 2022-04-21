class Solution {
    //directions
    int[][] dirs=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {   
        //create a count and initialize with 0
        int count=0;
        //find 1
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    
    public void dfs(char[][] grid, int x, int y){
        //change grid[x][y] state to 0 to represent this position was visited
        grid[x][y]='0';
        
        //neihbor state check
        for(int[] dir:dirs){
            int m=x+dir[0],n=y+dir[1];
            if(m<0 || m>=grid.length || n<0 || n>=grid[0].length || grid[m][n]=='0') continue;
            dfs(grid,m,n);
        }
        
    }
}
