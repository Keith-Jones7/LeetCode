package Exercises.Second_Medium;

import java.util.*;

//508 出现次数最多的子树元素和
public class most_frequent_subtree_sum {
    int maxCount = 0;
    int countMax = 0;
    Map<Integer, Integer> countMap = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        traverse(root);
        int[] ans = new int[countMax];
        int index = 0;
        for(Map.Entry<Integer, Integer> map : countMap.entrySet()) {
            if(map.getValue() == maxCount) {
                ans[index++] = map.getKey();
            }
        }
        return ans;
    }
    public int traverse(TreeNode root) {
        if(root == null) {
            return 0;
        }
        root.val = traverse(root.left) + traverse(root.right) + root.val;
        int count = countMap.getOrDefault(root.val, 0) + 1;
        countMap.put(root.val, count);
        if(count > maxCount) {
            maxCount = count;
            countMax = 1;
        }else if(count == maxCount) {
            countMax++;
        }
        return root.val;
    }
}
