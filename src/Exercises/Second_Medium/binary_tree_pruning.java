package Exercises.Second_Medium;
//814 二叉树剪枝
public class binary_tree_pruning {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        if(root.left == null && root.right == null) {
            if(root.val == 0) {
                return null;
            }else {
                return root;
            }
        }
        if(root.left == null) {
            root.right = pruneTree(root.right);
            if(root.right == null && root.val == 0) {
                return null;
            }else {
                return root;
            }
        }
        if(root.right == null) {
            root.left = pruneTree(root.left);
            if(root.left == null && root.val == 0) {
                return null;
            }else {
                return root;
            }
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.left == null && root.right == null && root.val == 0) {
            return null;
        }else {
            return root;
        }
    }
}
