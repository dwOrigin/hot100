package BinaryTree;

public class maxDepth {
    int max=0;
    public int maxDepths(TreeNode root){
        return getLen(root,0);
    }
    public int getLen(TreeNode root,int deep){
        if (root==null)return deep;
        deep++;
        int left=getLen(root.left,deep);
        int right=getLen(root.right,deep);
        return Math.max(left,right);
    }
}
