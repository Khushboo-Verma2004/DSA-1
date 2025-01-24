class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int count = -1;
        int fresh = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int time = 0;
        while(!q.isEmpty() && fresh>0){
            int size = q.size();
            for(int i =0; i<size; i++){
                int[]cell = q.poll();
                int x = cell[0];
                int y = cell[1];
                for(int k=0; k<4; k++){
                    int nx = x + dx[k];
                    int ny = y + dy[k];
                    if (nx >= 0 && ny >= 0 && nx < rows && ny < cols && grid[nx][ny] == 1) {
                        grid[nx][ny] = 2;
                        queue.add(new int[]{nx, ny});
                        freshOranges--; 
                    }
                }
            }
            time++;
        }
        if(fresh==0){
            return time;
        }
        else{
            return -1;
        }
    }
}
