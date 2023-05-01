package Exercises.Second_Medium;
import java.util.*;
//373 查找和最小的K对数字
public class find_k_pairs_with_smallest_sums {
    boolean flag = true;
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k){
        int n = nums1.length, m = nums2.length;
        if(n > m ){
            flag = false;
            return kSmallestPairs(nums2, nums1, k);
        }
        List<List<Integer>> ans = new ArrayList<>();

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                Comparator.comparingInt(x -> nums1[x[0]] + nums2[x[1]]));
        for(int i = 0; i < Math.min(n, k); i++){
            pq.offer(new int[]{i, 0});
        }
        while (ans.size() < k && !pq.isEmpty()){
            int[] indices = pq.poll();
            List<Integer> list = new ArrayList<>();
            list.add(flag ? nums1[indices[0]] : nums2[indices[1]]);
            list.add(flag ? nums2[indices[1]] : nums1[indices[0]]);
            ans.add(list);
            if(indices[1] + 1 < m){
                pq.offer(new int[]{indices[0], indices[1] + 1});
            }
        }
        return ans;
    }
}
