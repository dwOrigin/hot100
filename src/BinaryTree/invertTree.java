package BinaryTree;

public class invertTree {
    public TreeNode invertTrees(TreeNode root){
            if (root==null)return root;
            reverse(root);
            invertTrees(root.left);
            reverse(root.right);
            return root;
    }
    public TreeNode reverse(TreeNode root){
        TreeNode tem=new TreeNode();
        tem=root.left;
        root.left=root.right;
        root.right=tem;
        return root;
    }
}
