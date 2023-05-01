package Exercises.First_Easy;
//110 平衡二叉树
public class balanced_binary_tree {
    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }
    public int depth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = depth(root.left);
        if(left == -1) {
            return -1;
        }
        int right = depth(root.right);
        if(right == -1) {
            return -1;
        }
        if(Math.abs(left - right) < 2) {
            return 1 + Math.max(left, right);
        }else {
            return -1;
        }
    }
}
