package Exercises.Second_Medium;
//1669 合并两个链表
public class merge_in_between_linked_lists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        while (head2.next != null) {
            head2 = head2.next;
        }
        int index = 0;
        while (index != a - 1) {
            index++;
            head1 = head1.next;
        }
        ListNode temp = head1;
        while (index != b) {
            index++;
            head1 = head1.next;
        }
        temp.next = list2;
        head2.next = head1.next;
        return list1;
    }
}
