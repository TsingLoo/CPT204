import java.util.*;
public class ReConstructBinaryTree {
    class TreeNode
    {
        int val;
        TreeNode prev;
        TreeNode leftChild;
        TreeNode rightChild;
        TreeNode(int x){
            val = x;
        }
    }

    public static void main(String[] args)
    {
        int[] preOrder = {1,2,4,7,3,5,6,8};
        int[] vinOrder = {4,7,2,1,5,3,8,6};

        TreeNode rootNode = reConstructBinaryTree(preOrder,vinOrder);
    }

    public  static TreeNode reConstructBinaryTree(int [] pre,int [] vin) {
        ArrayList<Integer> preOrder = new ArrayList<Integer>();
        ArrayList<Integer> vinOrder = new ArrayList<Integer>();
        for (int i = 0; i < pre.length;i++)
        {
            preOrder.add(pre[i]);
            vinOrder.add(vin[i]);
        }
        //System.out.print(preOrder.toString());

        return null;
    }


    public  TreeNode Helper(List<Integer> preList,List<Integer> inOrderList)
    {
        if(inOrderList.size() == 0){
            return null;
        }
        int rootVal = preList.remove(0);
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = inOrderList.indexOf(rootVal);

        root.leftChild = Helper(preList,inOrderList.subList(0,rootIndex));
        root.rightChild = Helper(preList,inOrderList.subList(rootIndex+1,inOrderList.size()));
        return root;
    }



}
