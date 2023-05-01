package Exercises.Second_Medium;
import java.util.*;
//1305 两棵二叉搜索树中的所有元素
public class all_elements_in_two_binary_search_trees {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inorder(root1, list1);
        inorder(root2, list2);
        return mergeTwoSortLists(list1, list2);
    }
    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public List<Integer> mergeTwoSortLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>();
        int index1 = 0, index2 = 0;
        while (index1 < list1.size() || index2 < list2.size()) {
            if(index1 == list1.size()) {
                list.add(list2.get(index2++));
                continue;
            }
            if(index2 == list2.size()) {
                list.add(list1.get(index1++));
                continue;
            }
            int val1 = list1.get(index1);
            int val2 = list2.get(index2);
            if(val1 < val2) {
                list.add(val1);
                index1++;
            }else {
                list.add(val2);
                index2++;
            }
        }
        return list;
    }
}
