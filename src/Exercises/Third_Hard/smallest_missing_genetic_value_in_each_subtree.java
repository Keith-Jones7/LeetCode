package Exercises.Third_Hard;
import java.util.*;
//2003 每棵子树内缺失的最小基因值
public class smallest_missing_genetic_value_in_each_subtree {
    int[] ans;
    boolean[] seen = new boolean[100002]; // 基因值的范围是 [1, 10^5]
    List<Integer>[] children;
    int[] nums;

    public int[] smallestMissingValueSubtree(int[] parents, int[] nums) {
        int n = parents.length;
        this.nums = nums;
        ans = new int[n];
        Arrays.fill(ans, 1); // 初始时，每个子树的最小缺失值都是 1

        // 构建子树
        children = new List[n];
        for (int i = 0; i < n; ++i) {
            children[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; ++i) {
            children[parents[i]].add(i);
        }

        // 找到包含基因值 1 的节点
        int index = 0;
        while (nums[index] != 1) {
            index++;
            if (index == n) {
                return ans; // 如果没有基因值为 1 的节点，所有子树的最小缺失值都是 1
            }
        }

        // 更新包含基因值 1 的节点和它的所有祖先节点
        int missing = 1;
        while (index != -1) {
            dfs(index);
            while (seen[missing]) {
                missing++;
            }
            ans[index] = missing;
            index = parents[index];
        }
        return ans;
    }

    private void dfs(int node) {
        if (seen[nums[node]]) {
            return; // 如果这个基因值已经被处理过，直接返回
        }
        seen[nums[node]] = true;
        for (int child : children[node]) {
            dfs(child);
        }
    }
}
