package Exercises.Second_Medium;
//1123 最深叶节点的最近公共祖先
public class lowest_common_ancestor_of_deepest_leaves {
    TreeNode ans;
    int maxDepth;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        ans = null;
        maxDepth = -1;
        dfs(root);
        return ans;
    }
    public int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        if (leftDepth == rightDepth && leftDepth > maxDepth) {
            ans = root;
            maxDepth = leftDepth;
        }else if (leftDepth > rightDepth) {
            dfs(root.left);
        }else {
            dfs(root.right);
        }
    }
}
