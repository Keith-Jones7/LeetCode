package Exercises.Second_Medium;
import java.util.Random;
//382 链表随机节点
public class linked_list_random_node {
    int[] list;
    int length;
    Random random = new Random();
    public linked_list_random_node(ListNode head){
        length = 0;
        ListNode node = head;
        while(node != null){
            length++;
            node = node.next;
        }
        list = new int[length];
        node = head;
        for(int i = 0; i < length; i++){
            list[i] = node.val;
            node = node.next;
        }
    }
    public int getRandom(){
        return list[random.nextInt(length)];
    }
}
