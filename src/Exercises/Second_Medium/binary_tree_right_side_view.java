package Exercises.Second_Medium;
import java.util.*;
//199 二叉树的右视图
public class binary_tree_right_side_view {
    List<Integer> ans;
    public List<Integer> rightSideView(TreeNode root){
        ans = new ArrayList<>();
        DFS(root, 0);
        return ans;
    }
    public void DFS(TreeNode root, int depth){
        if(root == null){
            return;
        }
        if(depth == ans.size()){
            ans.add(root.val);
        }
        depth++;
        DFS(root.right, depth);
        DFS(root.left, depth);
    }
}
