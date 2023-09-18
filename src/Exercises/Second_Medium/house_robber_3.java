package Exercises.Second_Medium;
//337 打家劫舍3
public class house_robber_3 {
    public int rob(TreeNode root) {
        int[] ans = dfs(root);
        return Math.max(ans[0], ans[1]);
    }

    public int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        if (root.left == null && root.right == null) {
            return new int[]{root.val, 0};
        }
        int[] leftVal = dfs(root.left);
        int[] rightVal = dfs(root.right);
        int leftVal1 = leftVal[0];
        int leftVal2 = leftVal[1];
        int rightVal1 = rightVal[0];
        int rightVal2 = rightVal[1];
        return new int[]{Math.max(root.val + leftVal2 + rightVal2, leftVal1 + rightVal1), leftVal1 + rightVal1};
    }
}
