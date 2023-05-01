package Exercises.Second_Medium;
import java.util.*;
//652 寻找重复的子树
public class find_duplicate_subtrees {
    List<TreeNode> list = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return list;
    }
    public String dfs(TreeNode root) {
        if (root == null) {
            return "";
        }
        String str = String.valueOf(root.val) +
                '-' +
                dfs(root.left) + '+' + dfs(root.right) +
                '?';
        map.put(str, map.getOrDefault(str, 0) + 1);
        System.out.println(str);
        int key = map.get(str);
        if (key == 2) {
            list.add(root);
        }
        return str;
    }
}
