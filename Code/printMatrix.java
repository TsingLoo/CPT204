import java.util.ArrayList;

public class printMatrix {
    public ArrayList<Integer> printMatrixMethod(int [][] matrix) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        if(matrix.length == 0)
        {
            return result;
        }

        int left = 0;
        int right = matrix[0].length-1;
        int up = 0;
        int down = matrix.length -1;

        while(left <= right && up <= down)
        {
            for(int i=left; i<= right; i++)
            {
                result.add(matrix[up][i]);
            }
            up++;
            if(up>down)
                break;
            for(int i = up; i<= down ;i++)
            {
                result.add(matrix[i][right]);
            }
            right --;
            if(left>right)
            {
                break;
            }

            for(int i = right; i>= left; i--)
            {
                result.add(matrix[down][i]);
            }
            down--;

            if(up>down)break;

            for(int i = down; i>= up; i--)
            {
                result.add(matrix[i][left]);
            }
            left ++;
            if(left > right)
                break;
        }
        return result;

    }
}
