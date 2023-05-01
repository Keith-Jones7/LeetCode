package Exercises.Second_Medium;

import java.util.HashMap;

//105 从前序与中序遍历序列构造二叉树
public class construct_binary_tree_from_preorder_and_inorder_traversal {
    private HashMap<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    public TreeNode buildTree(int[] preorder, int left1, int right1, int[] inorder, int left2, int right2) {
        if(left1 > right1) {
            return null;
        }
        int root_val = preorder[left1];
        int in_root = map.get(root_val);
        TreeNode root = new TreeNode(root_val);
        int len = in_root - left2;
        root.left = buildTree(preorder, left1 + 1, left1 + len, inorder, left2, in_root - 1);
        root.right = buildTree(preorder, left1 + len + 1, right1, inorder, in_root + 1, right2);
        return root;
    }
}
