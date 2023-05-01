package Exercises.First_Easy;
//606 根据二叉树创建字符串
public class construct_string_from_binary_tree {
    StringBuilder stringBuilder;
    public String tree2str(TreeNode root) {
        stringBuilder = new StringBuilder();
        preOrder(root);
        return stringBuilder.toString();
    }
    public void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        stringBuilder.append(root.val);
        if(root.left != null && root.right != null) {
            stringBuilder.append("(");
            preOrder(root.left);
            stringBuilder.append(")(");
            preOrder(root.right);
            stringBuilder.append(')');
        }
        else if(root.left != null) {
            stringBuilder.append("(");
            preOrder(root.left);
            stringBuilder.append(")");
        }
        else if(root.right != null) {
            stringBuilder.append("()");
            stringBuilder.append("(");
            preOrder(root.right);
            stringBuilder.append(")");
        }
    }
}
