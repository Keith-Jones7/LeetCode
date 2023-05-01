package Exercises.Second_Medium;

import java.util.*;

//99 恢复二叉搜索树
public class recover_binary_search_tree {
    List<Integer> list = new ArrayList<>();
    int index = 0;
    public void recoverTree(TreeNode root) {
        inOrder(root);
        Collections.sort(list);
        recover(root);
    }
    public void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
    public void recover(TreeNode root) {
        if(root == null) {
            return;
        }
        recover(root.left);
        root.val = list.get(index++);
        recover(root.right);
    }
}
