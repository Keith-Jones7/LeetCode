package Exercises.Second_Medium;
//98 验证二叉搜索树
public class validate_binary_search_tree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);

    }
    public boolean isValidBST(TreeNode root, long MAX, long MIN) {
        if(root == null) {
            return true;
        }
        if(root.val >= MAX || root.val <= MIN) {
            return false;
        }
        return isValidBST(root.left, root.val, MIN) && isValidBST(root.right, MAX, root.val);
    }
}
