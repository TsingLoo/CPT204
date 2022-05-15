import com.sun.source.tree.Tree;

import java.util.*;
public class MirrorTree {
    public class TreeNode
    {
        TreeNode left = null;
        TreeNode right = null;
        int val = 0;

        TreeNode(int value)
        {
            this.val = value;
        }
    }

    public TreeNode Mirror (TreeNode pRoot) {
        if(pRoot == null)
        {
            return null;
        }

        Recur(pRoot);

        return pRoot;
        // write code here
    }

    public void Recur(TreeNode Head)
    {
        //不知道为啥，Head == null 必须写在最前面判断
        if(Head == null||(Head.left == null && Head.right == null))
        {
            return;
        }
        TreeNode temp = new TreeNode(-1);
        temp = Head.left;
        Head.left = Head.right;
        Head.right = temp;

        Recur(Head.left);

        //Recur(Head.left);

        Recur(Head.right);

        //Recur(Head.right);
    }

}
