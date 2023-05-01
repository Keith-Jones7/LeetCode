package Exercises.First_Easy;
//108 将有序数组转换为二叉搜索树
public class convert_sorted_array_to_binary_search_tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }
    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if(start > end) {
            return null;
        }
        if(start == end) {
            return new TreeNode(nums[start]);
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }
}
