package Exercises.Second_Medium;
import java.util.*;
//445 两数相加
public class add_two_numbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = ListToStack(l1);
        Stack<Integer> stack2 = ListToStack(l2);
        Stack<Integer> stack3 = add(stack1, stack2);
        return StackToList(stack3);
    }
    public Stack<Integer> ListToStack(ListNode listnode) {
        Stack<Integer> stack = new Stack<>();
        while (listnode != null) {
            stack.add(listnode.val);
            listnode = listnode.next;
        }
        return stack;
    }
    public ListNode StackToList(Stack<Integer> stack) {
        int size = stack.size();
        ListNode[] nodes = new ListNode[size];
        for(int i = 0; i < size; i++) {
            nodes[i] = new ListNode(stack.pop());
        }
        for(int i = 0; i < size - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }
        nodes[size - 1].next = null;
        return nodes[0];
    }
    public Stack<Integer> add(Stack<Integer> stack1, Stack<Integer> stack2) {
        int add = 0;
        Stack<Integer> stack = new Stack<>();
        while (!(stack1.empty() && stack2.empty())) {
            int sum = 0;
            if(stack1.empty()) {
                sum += (stack2.pop() + add);
            } else if(stack2.empty()) {
                sum += (stack1.pop() + add);
            } else {
                sum = stack1.pop() + stack2.pop() + add;
            }
            if(sum > 9) {
                sum -= 10;
                add = 1;
            }else {
                add = 0;
            }
            stack.add(sum);
        }
        if(add > 0) {
            stack.add(add);
        }
        return stack;
    }
}
