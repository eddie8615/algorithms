package Search;

import java.util.Stack;

public class Leetcode695 {

    /**
     * Iterative dfs approach
     * @param grid
     * @return
     */
    public int maxareaOfIsland(int[][] grid){
        int max = 0;
        Stack<int[]> stack = new Stack<>();

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0){
                    stack.push(new int[]{i, j});
                    int area = 0;
                    while(!stack.isEmpty()){
                        int[] coor = stack.pop();
                        int row = coor[0];
                        int col = coor[1];

                        if(grid[row][col] == 1)
                            area++;
                        grid[row][col] = 0;

                        if(row + 1 < grid.length && grid[row + 1][col] == 1) stack.push(new int[]{row + 1, col});
                        if(row - 1 >= 0 && grid[row - 1][col] == 1) stack.push(new int[]{row - 1, col});
                        if(col + 1 < grid[0].length && grid[row][col + 1] == 1) stack.push(new int[]{row, col + 1});
                        if(col - 1 >= 0 && grid[row][col - 1] == 1) stack.push(new int[]{row, col - 1});

                    }
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }
}
