package Exercises.Second_Medium;

import java.util.*;

//817 链表组件
public class linked_list_components {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int count = 0;
        boolean flag = false;
        while (head != null) {
            if (!set.contains(head.val)) {
                flag = false;
            }else {
                if (!flag) {
                    count++;
                    flag = true;
                }
            }
            head = head.next;
        }
        return count;
    }
}
