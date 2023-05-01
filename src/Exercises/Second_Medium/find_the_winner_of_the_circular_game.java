package Exercises.Second_Medium;
//1823 找出游戏的获胜者
public class find_the_winner_of_the_circular_game {
    public int findTheWinner(int n, int k){
        if(k == 1){
            return n;
        }
        Node head = new Node(1);
        Node node = head;
        for(int i = 2; i <= n; i++){
            node.next = new Node(i);
            node = node.next;
        }
        node.next = head;
        while (head.next != head){
            Node temp = head;
            for(int i = 2; i < k; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            head = temp.next;
        }
        return head.num;
    }

    private static class Node{
        int num;
        Node next;
        Node(int num){
            this.num = num;
        }
    }
}


