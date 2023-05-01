package Exercises.Second_Medium;
import java.util.*;
//655 输出二叉树
public class print_binary_tree {
    String[][] strs;
    int height;
    public List<List<String>> printTree(TreeNode root) {
        height = depth(root) - 1;
        strs = new String[height + 1][(1 << (height + 1)) - 1];
        dfs(root, 0, (strs[0].length - 1) / 2);
        List<List<String>> res = new ArrayList<>();
        for (String[] str : strs) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < strs[0].length; i++) {
                list.add(str[i] == null ? "" : str[i]);
            }
            res.add(list);
        }
        return res;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

    public void dfs(TreeNode root, int rowIndex, int colIndex) {
        if (root == null) {
            return;
        }
        strs[rowIndex][colIndex] = String.valueOf(root.val);
        int power = 1 << (height - rowIndex - 1);
        System.out.println(power);
        dfs(root.left, rowIndex + 1, colIndex - power);
        dfs(root.right, rowIndex + 1, colIndex + power);
    }
}
