package Exercises.First_Easy;
//965 单值二叉树
public class univalued_binary_tree {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isUnivalued(root, root.val);
    }
    public boolean isUnivalued(TreeNode root, int val) {
        if(root == null) {
            return true;
        }
        if(root.val != val) {
            return false;
        }
        return isUnivalued(root.left, root.val) && isUnivalued(root.right, root.val);
    }
}
