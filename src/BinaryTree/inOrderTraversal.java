package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class inOrderTraversal {
    List<Integer>res=new ArrayList<>();
    public List<Integer> inOrderTraversals(TreeNode root){
        if (root==null)return null;
        while (root!=null){
            inOrderTraversals(root.left);
            res.add(root.val);
            inOrderTraversals(root.right);
        }
        return res;
    }

}
