public class NextInOrderElement {
    /*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
    public class Solution {
        public TreeLinkNode GetNext(TreeLinkNode pNode) {

            if(pNode == null)
            {
                return null;
            }


            //if this node has right sub-tree, then return the leftmost child of this subtree
            if(pNode.right != null)
            {
                TreeLinkNode tempNode = pNode.right;
                while(tempNode.left != null)
                {
                    tempNode = tempNode.left;
                }
                return tempNode;
            }else
            {
                //if this node does not have right sub-tree
                TreeLinkNode tempNode = pNode;
                TreeLinkNode parentNode = pNode.next;

                //if this is node is the left node of a subtree
                if(parentNode == null||parentNode.left == tempNode )
                {
                    return parentNode;
                }else
                {
                    //if this node is the right node of a subtree
                    TreeLinkNode pparent = parentNode.next;
                    while(pparent != null && pparent.left != parentNode)
                    {
                        parentNode = pparent;
                        pparent = pparent.next;
                    }
                    return pparent;
                }
            }

        }
    }

}
