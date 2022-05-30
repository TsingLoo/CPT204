import java.util.*;

public class maxValue {
    public  int maxValueMethod(int[][] grid)
    {
        int row = grid.length;
        int col = grid[0].length;

        //需要从1开始，不然grid[i-1]没有意义
        //先将第一列算好
        for(int i=1; i<row ;i++)
        {
            grid[i][0] += grid[i-1][0];
        }


        for(int i = 1;i<col;i++)
        {
            grid[0][i] += grid[0][i-1];
        }

        for(int i = 1;i<row;i++)
        {
            for(int j=1; j<col;j++)
            {
                grid[i][j] += Math.max(grid[i-1][j],grid[i][j-1]);
            }
        }

        return grid[row-1][col-1];
    }
}
