import java.util.*;

public class movingCount {
    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];

        return dfs(0,0,threshold, rows, cols, visited);

    }

    public int dfs(int i, int j, int threshold, int rows, int cols, boolean[][] visited)
    {
        if(i<0 || j <0 || i>=rows || j>= cols || sum(i,j)>threshold || visited[i][j])
        {
            return 0;
        }

        visited[i][j] = true;

        return 1 + dfs(i + 1, j,threshold, rows, cols,  visited) +
                dfs(i, j + 1, threshold,rows, cols,  visited) +  dfs(i, j-1, threshold,rows, cols,  visited)+
                dfs(i-1, j, threshold,  rows, cols,visited);

    }

    public int sum(int a, int b)
    {
        int result = 0;

        while(a>0)
        {
            result += a%10;
            a = a/10;
        }

        while(b > 0)
        {
            result += b%10;
            b = b/10;
        }
        return  result;
    }

}
