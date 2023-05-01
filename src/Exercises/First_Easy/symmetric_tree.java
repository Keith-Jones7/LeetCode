package Exercises.First_Easy;
//101 对称二叉树
public class symmetric_tree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSame(root.left, root.right);
    }
    public boolean isSame(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null){
            return false;
        }
        if(right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return (isSame(left.right, right.left) && isSame(left.left, right.right));
    }
}
