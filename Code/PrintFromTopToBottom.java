import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class PrintFromTopToBottom {
    private class TreeNode
    {
        TreeNode left = null;
        TreeNode right = null;
        int val  =0;

        public  TreeNode(int val)
        {
            this.val = val;
        }
    }

    public ArrayList<Integer> PrintFromTopToBottomMethod(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
        {
            return null;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode cur = q.poll();
            res.add(cur.val);
            if(cur.left!=null)
            {
                q.offer(cur.left);
            }
            if(cur.right!= null)
            {
                q.offer(cur.right);
            }
        }
        return res;
    }
}
