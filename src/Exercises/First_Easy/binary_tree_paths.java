package Exercises.First_Easy;

import java.util.*;
//257 二叉树的所有路径
public class binary_tree_paths {
    String plus = "->";
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        backTrack(root, new StringBuilder());
        return list;
    }

    public void backTrack(TreeNode root, StringBuilder stringBuilder) {
        stringBuilder.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(stringBuilder.toString());
        }else if (root.left == null) {
            stringBuilder.append(plus);
            backTrack(root.right, stringBuilder);
        }else if (root.right == null) {
            stringBuilder.append(plus);
            backTrack(root.left, stringBuilder);
        }else {
            stringBuilder.append(plus);
            int len1 = stringBuilder.length();
            backTrack(root.left, stringBuilder);
            stringBuilder.delete(len1, stringBuilder.length());
            backTrack(root.right, stringBuilder);
        }
    }
}
