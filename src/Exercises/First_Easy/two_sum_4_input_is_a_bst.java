package Exercises.First_Easy;

import java.util.*;

//653 两数之和4—输入BST
public class two_sum_4_input_is_a_bst {
    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        traverse(root);
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if(sum > k) {
                right--;
            } else if(sum < k){
                left++;
            } else {
                return true;
            }
        }
        return false;
    }
    public void traverse(TreeNode root) {
        if(root == null) {
            return;
        }
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }
}
