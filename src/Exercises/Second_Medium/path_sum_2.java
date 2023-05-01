package Exercises.Second_Medium;
//113 路径之和2
import java.util.*;
public class path_sum_2 {
    List<List<Integer>> ans;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        ans = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        DFS(root, targetSum, new ArrayList<>());
        return ans;
    }
    public void DFS(TreeNode root, int targetSum, List<Integer> path){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(root.val == targetSum){
                path.add(root.val);
                ans.add(new ArrayList<>(path));
                path.remove(path.size() - 1);
            }
            return;
        }
        path.add(root.val);
        DFS(root.left, targetSum - root.val, path);
        DFS(root.right, targetSum - root.val, path);
        path.remove(path.size() - 1);
    }
}
