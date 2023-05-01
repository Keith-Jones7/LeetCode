package Exercises.Second_Medium;

import java.util.*;

//449 序列化和反序列化二叉搜索树
public class serialize_and_deserialize_bst {
    List<Integer> preorder_list;
    List<Integer> inorder_list;
    StringBuilder stringBuilder;
    private HashMap<Integer, Integer> map;
    public String serialize(TreeNode root) {
        stringBuilder = new StringBuilder();
        preOrder(root);
        return stringBuilder.toString();
    }

    public TreeNode deserialize(String data) {
        if(data.length() == 0) {
            return null;
        }
        preorder_list = new ArrayList<>();
        inorder_list = new ArrayList<>();
        String[] strings = data.split(",");
        for(String str : strings) {
            int val = Integer.parseInt(str);
            preorder_list.add(val);
            inorder_list.add(val);
        }
        Collections.sort(inorder_list);
        return buildTree(preorder_list, inorder_list);
    }
    public void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        stringBuilder.append(root.val);
        stringBuilder.append(',');
        preOrder(root.left);
        preOrder(root.right);
    }
    public TreeNode buildTree(List<Integer> preorder, List<Integer> inorder) {
        map = new HashMap<>();
        int n = preorder.size();
        for(int i = 0; i < n; i++) {
            map.put(inorder.get(i), i);
        }
        return buildTree(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    public TreeNode buildTree(List<Integer> preorder, int left1, int right1, List<Integer> inorder, int left2, int right2) {
        if(left1 > right1) {
            return null;
        }
        int root_val = preorder.get(left1);
        int in_root = map.get(root_val);
        TreeNode root = new TreeNode(root_val);
        int len = in_root - left2;
        root.left = buildTree(preorder, left1 + 1, left1 + len, inorder, left2, in_root - 1);
        root.right = buildTree(preorder, left1 + len + 1, right1, inorder, in_root + 1, right2);
        return root;
    }
}
