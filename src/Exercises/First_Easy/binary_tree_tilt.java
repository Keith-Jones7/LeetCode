package Exercises.First_Easy;
//563 二叉树的坡度
public class binary_tree_tilt {
    private int ans;
    public int findTilt(TreeNode root){
        ans = 0;
        sum(root);
        return ans;
    }
    private int sum(TreeNode root){
        if(root == null){
            return 0;
        }
        int left_sum = sum(root.left);
        int right_sum = sum(root.right);
        ans += Math.abs(left_sum - right_sum);
        return right_sum + left_sum + root.val;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){

    }
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
