import java.util.*;

public class PathInMatrix {
    public static void main(String[] args)
    {

        char[][] chars = new char[][]
        {
            {'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}
        };

        hasPath(chars,"bcced");

    }

    public static boolean hasPath(char[][] matrix,String word)
    {
        char[] words = word.toCharArray();
        if(word.length() == 0 || word == null)
        {
            return  false;
        }

        int visited[][] = new int[matrix.length][matrix[0].length];


        for(int i=0; i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(word.charAt(0) == matrix[i][j])
                {
                    for(int k=0; k<word.length();k++)
                    {
                        dfs(matrix,words,i,j,0);
                    }
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] matrix, char[] words, int i, int j, int index)
    {
        if(i< 0 || i>=matrix.length || j>=matrix[0].length || j<0 || matrix[i][j] != words[index])
        {
            return false;
        }

        if(index ==  words.length -1)
        {
            return true;
        }

        char temp = matrix[i][j];
        matrix[i][j] = '.';
        boolean res = dfs(matrix, words, i + 1, j, index + 1)|| dfs(matrix, words, i - 1, j, index + 1)
                || dfs(matrix, words, i, j + 1, index + 1)
                || dfs(matrix, words, i, j - 1, index + 1);
        matrix[i][j] = temp;
        return res;
    }



}
