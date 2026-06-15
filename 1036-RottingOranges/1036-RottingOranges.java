// Last updated: 6/15/2026, 7:17:33 PM
import java.util.*;
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue <int[]> queue = new LinkedList<>();
        int minutes = 0;
        int freshCount = 0;

        for(int i = 0; i<m; ++i){
            for(int j = 0; j<n; ++j){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    freshCount++;
                }

            }
        }

        if(freshCount == 0) return 0;

        int[][] directions = {{-1,0},{0,-1},{0,1},{1,0}};

        while(!queue.isEmpty()){
            int size = queue.size();
            boolean isRottedAtThisStep = false;
            for(int i = 0 ; i < size ; i++){
                int [] cell = queue.poll();
                int x = cell[0], y = cell[1];

                for(int[] dir : directions){
                    int nx = dir[0] + x;
                    int ny = dir[1] + y;
                    if(nx>=0 && ny>=0 && nx<m && ny<n &&  grid[nx][ny] == 1){
                        grid[nx][ny] = 2;
                        isRottedAtThisStep = true;
                        queue.offer(new int[]{nx,ny});
                        freshCount--;
                    }
                }
            }

            if(isRottedAtThisStep) minutes++;
        }
        return freshCount == 0 ? minutes : -1;
    }
}