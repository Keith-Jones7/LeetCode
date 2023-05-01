package Exercises.First_Easy;
import java.util.*;
//144 二叉树的前序遍历
public class binary_tree_preorder_traversal {

    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> pre = new ArrayList<>();
        preorder(root, pre);
        return pre;
    }
    public void preorder(TreeNode root, List<Integer> pre){
        if(root == null){
            return;
        }
        pre.add(root.val);
        preorder(root.left, pre);
        preorder(root.right, pre);
    }
}
