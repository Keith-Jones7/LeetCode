package Exercises.First_Easy;
//155 最小栈
public class min_stack {
    private stackNode head;
    public min_stack(){

    }
    public void push(int val){
        if(head == null){
            head = new stackNode(val, val);
        }
        else {
            head = new stackNode(val, Math.min(head.min, val), head);
        }
    }
    public void pop(){
        head = head.next;
    }
    public int top(){
        return head.val;
    }
    public int getMin(){
        return head.min;
    }
}
class stackNode{
    int val;
    int min;
    stackNode next;
    public stackNode(int val, int min){
        this(val, min, null);
    }
    public stackNode(int val, int min, stackNode next){
        this.val = val;
        this.min = min;
        this.next = next;
    }
}
