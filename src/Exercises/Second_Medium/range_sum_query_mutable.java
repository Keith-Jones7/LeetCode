package Exercises.Second_Medium;
//307 区域和检索-数组可修改
public class range_sum_query_mutable {
    TreeNodeArr root;
    public range_sum_query_mutable(int[] nums) {
        root = initial(nums, 0, nums.length - 1);
    }
    public void update(int index, int val) {
        update(root, index, val);
    }
    public int sumRange(int left, int right) {
        return sumRange(root, left, right);
    }
    private TreeNodeArr initial(int[] nums, int start, int end) {
        if(start > end) {
            return null;
        }
        if(start == end) {
            TreeNodeArr node = new TreeNodeArr(start, end);
            node.sum = nums[start];
            return node;
        }else {
            int mid = start + (end - start) / 2;
            TreeNodeArr node = new TreeNodeArr(start, end);
            node.left = initial(nums, start, mid);
            node.right = initial(nums, mid + 1, end);
            int sum = 0;
            if(node.left != null) {
                sum += node.left.sum;
            }
            if(node.right != null) {
                sum += node.right.sum;
            }
            node.sum = sum;
            return node;
        }
    }
    public int sumRange(TreeNodeArr root, int left, int right) {
        if(root.start == left && root.end == right) {
            return root.sum;
        }
        int mid = root.start + (root.end - root.start) / 2;
        if(right <= mid) {
            return sumRange(root.left, left, right);
        }
        if(left > mid) {
            return sumRange(root.right, left, right);
        }
        return sumRange(root.left, left, mid) + sumRange(root.right, mid + 1, right);
    }
    public void update(TreeNodeArr root, int index, int val) {
        if(root.start == root.end) {
            root.sum = val;
        } else {
            int mid = root.start + (root.end - root.start) / 2;
            if(index <= mid) {
                update(root.left, index, val);
            }else {
                update(root.right, index, val);
            }
            root.sum = root.left.sum + root.right.sum;
        }
    }
}
class TreeNodeArr {
    int sum;
    int start, end;
    TreeNodeArr left, right;
    public TreeNodeArr (int start, int end) {
        this.start = start;
        this.end = end;
    }
}
