package Exercises.First_Easy;
//226 翻转二叉树
public class invert_binary_tree {
    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode invert_left = invertTree(root.left);
        TreeNode invert_right = invertTree(root.right);
        root.right = invert_left;
        root.left = invert_right;
        return root;
    }
}
