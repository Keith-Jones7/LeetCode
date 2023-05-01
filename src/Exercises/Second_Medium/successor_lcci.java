package Exercises.Second_Medium;

//面试题04.06 后继者
public class successor_lcci {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null) {
            return null;
        }
        if(root.val <= p.val) {
            return inorderSuccessor(root.right, p);
        }
        TreeNode treeNode = inorderSuccessor(root.left, p);
        return treeNode == null ? root : treeNode;
    }

}
