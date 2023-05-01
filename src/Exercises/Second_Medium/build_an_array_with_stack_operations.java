package Exercises.Second_Medium;
import java.util.*;
//1441 用栈操作构建数组
public class build_an_array_with_stack_operations {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        String push = "Push", pop = "Pop";
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (index == target.length) {
                break;
            }
            if (target[index] == i) {
                list.add(push);
                index++;
            }else {
                list.add(push);
                list.add(pop);
            }
        }
        return list;
    }
}
