package Exercises.First_Easy;
import java.util.*;
//1656 设计有序流
public class design_an_ordered_stream {

}
class OrderedStream {
    int ptr;
    String[] stream;
    int maxSize;
    public OrderedStream(int n) {
        stream = new String[n];
        ptr = 1;
        maxSize = 0;
    }

    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<>();
        stream[idKey - 1] = value;
        maxSize = Math.max(idKey, maxSize);
        if (idKey == ptr) {
            int cur = idKey;
            for (; cur <= maxSize; cur++) {
                if (stream[cur - 1] == null) {
                    break;
                }
                list.add(stream[cur - 1]);
            }
           ptr = cur;
        }
        return list;
    }
}
