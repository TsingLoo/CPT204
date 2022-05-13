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
        if((Head.left == null && Head.right == null)||Head == null)
        {
            return;
        }

        TreeNode temp = new TreeNode(-1);
        temp = Head.left;
        Head.left = Head.right;
        Head.right = temp;

        if(Head.left!=null)
        {
            Recur(Head.left);
        }
        //Recur(Head.left);
        if(Head.right!=null)
        {
            Recur(Head.right);
        }
        //Recur(Head.right);
    }


}
