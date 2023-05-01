package Exercises.Second_Medium;
//654 最大二叉树
public class maximum_binary_tree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }

    public TreeNode construct(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end) {
            return new TreeNode(nums[start]);
        }
        int max = -1, index = -1;
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = construct(nums, start, index - 1);
        root.right = construct(nums, index + 1, end);
        return root;
    }
}
class Solution {
    int ans = 0;
    int depth = -1;
    public int amountOfTime(TreeNode root, int start) {
        DFS(root, 0, start);
        return ans;
    }
    public int DFS(TreeNode root, int level, int start) {
        if (root == null) {
            return 0;
        }
        if (root.val == start) {
            depth = level;
        }
        int left_depth = DFS(root.left, level + 1, start);
        boolean inLeft = (depth != -1);
        int right_depth = DFS(root.right, level + 1, start);

        if (root.val == start) {
            ans = Math.max(left_depth, right_depth);
        }
        if (inLeft) {
            ans = Math.max(ans, depth - level + right_depth);
        }else {
            ans = Math.max(ans, depth - level + left_depth);
        }
        return Math.max(left_depth, right_depth) + 1;
    }

}

