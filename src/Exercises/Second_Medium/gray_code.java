package Exercises.Second_Medium;
import java.util.*;
//89 格雷编码
public class gray_code {
    public List<Integer> grayCode(int n){
        if(n == 1){
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(1);
            return list;
        }
        List<Integer> list = grayCode(n - 1);
        int len = list.size();
        for(int i = len - 1; i >= 0; i--){
            list.add(list.get(i) + 2 * len);
        }
        return list;
    }
}
