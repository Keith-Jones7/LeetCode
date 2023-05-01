package Exercises.Second_Medium;
//1367 二叉树中的列表
public class linked_list_in_binary_tree {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root == null) {
            return false;
        }
        if(head.val == root.val && isSubPathFromRoot(head, root)) {
            return true;
        }
        return (isSubPath(head, root.left) || isSubPath(head, root.right));
    }
    public boolean isSubPathFromRoot(ListNode head, TreeNode root) {
        if(head == null) {
            return true;
        }
        if(root == null) {
            return false;
        }
        boolean bool = (head.val == root.val);
        return bool && (isSubPathFromRoot(head.next, root.left) || isSubPathFromRoot(head.next, root.right));
    }
}
