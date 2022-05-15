public class isSymmetrical {
    public class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
    }


    public boolean isSymmetricalMethod(TreeNode pHead)
    {
        return  recurCheck(pHead,pHead);
    }

    public boolean recurCheck(TreeNode root1,TreeNode root2)
    {
        if(root1 == null && root2 == null)
        {
            return  true;
        }

        if(root1==null || root2 == null || root1.val != root2.val)
        {
            return  false;
        }

        return  recurCheck(root1.left,root2.right)&&recurCheck(root2.right,root1.left);
    }
}
