class Solution {
    public int[][] updateMatrix(int[][] mat) {
        /*test case:
        [[1,1,1],[1,1,1],[1,0,1]]
        [[0,0,0],[0,0,0],[0,0,1]]
        */
        //creat m and n to be mat withe and heigh
        int m=mat.length, n=mat[0].length;
        //creat a int[][] data type to be a result
        int[][] result=new int[m][n];
        //create a queue to keep all coordinate of 0
        Queue<int[]> queue=new LinkedList<>();
        //create a matrix to keep the state of element
        boolean[][] state=new boolean[m][n];
        //find all 0
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    queue.offer(new int[]{i,j});
                    //set the location is visited.
                    state[i][j]=true;
                }
            }
        }
        int level=0;
        //create a directions
        int[][] dirs=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int[] cur=queue.poll();
                if(mat[cur[0]][cur[1]]==1){
                    result[cur[0]][cur[1]]=level;
                }
                for(int[] dir:dirs){
                    int x=cur[0]+dir[0];
                    int y=cur[1]+dir[1];
                    if(x>=0 && x<m && y>=0 && y<n && !state[x][y]){
                        queue.offer(new int[]{x,y});
                        state[x][y]=true;
                    }
                }
            }
            level++;
        }
        return result;
    }
}
