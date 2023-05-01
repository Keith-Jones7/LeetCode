package Exercises.First_Easy;
//700 二叉搜索树中的搜索
public class search_in_a_binary_search_tree {
    public TreeNode searchBST(TreeNode root, int val){
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        TreeNode _left = searchBST(root.left, val);
        TreeNode _right = searchBST(root.right, val);
        if(_left != null){
            return _left;
        }
        return _right;
    }
}
