package Exercises.First_Easy;
import java.util.*;
//232 用栈实现队列
public class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void push(int x){
       if(empty()){
           stack1.push(x);
           return;
       }
       if(stack1.isEmpty()){
           stack2.push(x);
           return;
       }
       if(stack2.isEmpty()){
           stack1.push(x);
       }
    }
    public int pop(){
        if(stack1.isEmpty()){
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            int ans = stack1.pop();
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return ans;
        }
        else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            int ans = stack2.pop();
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return ans;
        }
    }
    public int peek(){
        if(stack1.isEmpty()){
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            int ans = stack1.peek();
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return ans;
        }
        else {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            int ans = stack2.peek();
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return ans;
        }
    }
    public boolean empty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
