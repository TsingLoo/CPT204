import java.util.*;

public class InOrderTraversal {

    public static ArrayList<TreeLinkNode> list = new ArrayList<>();
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        //从根节点开始
        while(pNode.next != null)
        {
            pNode = pNode.next;
        }

        ConstructTree(pNode);
        return null;
    }

    void ConstructTree(TreeLinkNode pNode)
    {
        if(pNode == null) return;
        ConstructTree(pNode.left);
        list.add(pNode);
        ConstructTree(pNode.right);
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}