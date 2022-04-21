class Solution {
    //set directions
    int[][] dirs=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {       
        int count=0;
        //BFS
        int m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    count++;
                    bfs(grid,i,j);
                    
                }
            }
        }
        return count;
    }
    
    public void bfs(char[][] grid, int i, int j){
        int m=grid.length,n=grid[0].length;
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{i,j});
        while(!queue.isEmpty()){
            int[] cur=queue.poll();
            for(int[] dir:dirs){
                int x=cur[0]+dir[0],y=cur[1]+dir[1];
                if(x>=0 && x<m && y>=0 && y<n && grid[x][y]=='1'){
                    queue.offer(new int[]{x,y});
                    grid[x][y]='0';
                }
            }
        }
    }
    
}
