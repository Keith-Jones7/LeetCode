package Exercises.First_Easy;
//94 二叉树的中序遍历
import java.util.*;
public class binary_tree_inorder_traversal {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }
    public void inorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
