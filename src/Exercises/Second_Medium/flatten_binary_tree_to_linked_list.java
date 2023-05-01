package Exercises.Second_Medium;
//114 二叉树展开为链表
public class flatten_binary_tree_to_linked_list {
    public void flatten(TreeNode root) {
        if(root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode right = root.right;
        TreeNode left = root.left;
        root.left = null;
        root.right = left;

        TreeNode node = root;
        while (node.right != null) {
            node = node.right;
        }
        node.right = right;
    }
}
