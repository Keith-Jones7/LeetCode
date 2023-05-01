package Exercises.Second_Medium;
//236 二叉树的最近公共祖先
public class lowest_common_ancestor_of_a_binary_tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null){
            return root;
        }
        if(left != null){
            return left;
        }
        return right;
    }

}
