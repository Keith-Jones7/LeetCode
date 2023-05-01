package Exercises.First_Easy;

import java.util.ArrayList;
import java.util.List;

//145 二叉树的后序遍历
public class binary_tree_postorder_traversal {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }
    public void postorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);

    }
}
